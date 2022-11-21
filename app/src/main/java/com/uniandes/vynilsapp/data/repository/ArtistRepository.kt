package com.uniandes.vynilsapp.data.repository

import android.app.Application
import com.uniandes.vynilsapp.data.model.Performer
import com.uniandes.vynilsapp.data.service.RetrofitBroker

class ArtistRepository(val application: Application) {

    suspend fun getAllArtists(): List<Performer> = RetrofitBroker.getAllArtists()

}