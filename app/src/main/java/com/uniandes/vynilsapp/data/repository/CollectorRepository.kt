package com.uniandes.vynilsapp.data.repository

import android.app.Application
import com.uniandes.vynilsapp.data.model.Collector
import com.uniandes.vynilsapp.data.model.Performer
import com.uniandes.vynilsapp.data.service.RetrofitBroker

class CollectorRepository(val application: Application) {

    suspend fun getAllCollectors(): List<Collector> = RetrofitBroker.getAllCollectors()

}