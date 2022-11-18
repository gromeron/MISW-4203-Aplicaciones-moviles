package com.uniandes.vynilsapp.data.service

import com.uniandes.vynilsapp.data.model.Collector
import com.uniandes.vynilsapp.data.model.Performer
import retrofit2.Response
import retrofit2.http.GET

interface CollectorApi {

    @GET("collectors")
    suspend fun getAllCollectors(): Response<List<Collector>>

}