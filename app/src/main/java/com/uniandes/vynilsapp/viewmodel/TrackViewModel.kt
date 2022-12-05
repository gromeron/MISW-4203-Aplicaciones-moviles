package com.uniandes.vynilsapp.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.uniandes.vynilsapp.data.model.Track
import com.uniandes.vynilsapp.data.repository.TrackRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TrackViewModel(application: Application) : AndroidViewModel(application) {

    val trackCreated = MutableLiveData<Track>()
    private val tracksRepository = TrackRepository(application)

    fun createTrack(albumId:Int, track: Track) {
        try {
            viewModelScope.launch(Dispatchers.IO) {
                trackCreated.postValue(tracksRepository.createTrack(albumId, track))
            }
        } catch (e: java.lang.Exception) {
            Log.e("Error", e.message ?: "Failure service")
        }
    }
}