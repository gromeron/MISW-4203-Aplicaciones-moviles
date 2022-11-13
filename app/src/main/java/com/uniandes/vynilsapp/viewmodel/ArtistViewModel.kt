package com.uniandes.vynilsapp.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.data.model.Performer
import com.uniandes.vynilsapp.data.repository.ArtistRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistViewModel(application: Application): AndroidViewModel(application) {

    val artistList = MutableLiveData<List<Album>>()

    private val artistRepository = ArtistRepository(application)

    val artists: LiveData<List<Performer>>
        get() = artistList

    init {
        getArtists()
    }

    private fun getArtists() {
        try {
            viewModelScope.launch(Dispatchers.IO) {
                artistList.postValue(artistRepository.getAllArtists())
            }
        } catch (e: Exception) {
            Log.e("Error", e.message ?: "Failure service")
        }
    }

}