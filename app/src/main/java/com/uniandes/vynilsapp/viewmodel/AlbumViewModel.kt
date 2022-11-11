package com.uniandes.vynilsapp.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.data.repository.AlbumRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AlbumViewModel(application: Application): AndroidViewModel(application) {

    private val albumList = MutableLiveData<List<Album>>()

    private val albumsRepository = AlbumRepository(application)

    val albums: LiveData<List<Album>>
        get() = albumList

    init {
        getAlbums()
    }

    private fun getAlbums() {
        try {
            viewModelScope.launch(Dispatchers.IO) {
                albumList.postValue(albumsRepository.getAllAlbums())
            }
        } catch (e: Exception) {
            Log.e("Error", e.message ?: "Failure service")
        }
    }

}