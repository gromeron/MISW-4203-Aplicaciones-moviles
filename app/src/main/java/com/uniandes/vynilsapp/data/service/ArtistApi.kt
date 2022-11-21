package com.uniandes.vynilsapp.data.service

import com.uniandes.vynilsapp.data.model.Performer
import retrofit2.Response
import retrofit2.http.GET

interface ArtistApi {

    @GET("musicians")
    suspend fun getAllArtists(): Response<List<Performer>>

}