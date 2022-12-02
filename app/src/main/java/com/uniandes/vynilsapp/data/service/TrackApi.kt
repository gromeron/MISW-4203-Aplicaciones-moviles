package com.uniandes.vynilsapp.data.service

import com.uniandes.vynilsapp.data.model.Track
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface TrackApi {

    @POST("tracks")
    suspend fun createTrack(@Body track: Track) : Response<Track>
}