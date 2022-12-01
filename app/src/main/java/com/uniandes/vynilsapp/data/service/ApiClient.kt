package com.uniandes.vynilsapp.data.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://vynils-back.onrender.com/"

object ApiClient {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val albums: AlbumApi = retrofit.create(AlbumApi::class.java)
    val artists: ArtistApi = retrofit.create(ArtistApi::class.java)
    val collectors: CollectorApi = retrofit.create(CollectorApi::class.java)

}