package com.uniandes.vynilsapp.data.service

import com.uniandes.vynilsapp.data.model.Album
import retrofit2.Response
import retrofit2.http.GET

interface AlbumApi {

    @GET("albums")
    suspend fun getAllAlbums(): Response<List<Album>>

}