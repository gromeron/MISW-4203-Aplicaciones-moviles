package com.uniandes.vynilsapp.data.repository

import android.app.Application
import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.data.service.RetrofitBroker

class AlbumRepository(val application: Application) {

    suspend fun getAllAlbums(): List<Album> = RetrofitBroker.getAllAlbums()

}