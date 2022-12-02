package com.uniandes.vynilsapp.data.service

import com.uniandes.vynilsapp.data.model.Track
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface TrackApi {

    @POST("albums/{albumId}/tracks")
    suspend fun createTrack(@Path("albumId") albumId:Int, @Body track: Track) : Response<Track>
}