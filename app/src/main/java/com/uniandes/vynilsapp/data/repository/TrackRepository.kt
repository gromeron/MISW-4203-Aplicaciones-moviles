package com.uniandes.vynilsapp.data.repository

import android.app.Application
import com.uniandes.vynilsapp.data.model.Track
import com.uniandes.vynilsapp.data.service.RetrofitBroker

class TrackRepository (val application: Application) {
    suspend fun createTrack(track: Track) = RetrofitBroker.createTrack(track)
}