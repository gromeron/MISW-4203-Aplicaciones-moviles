package com.uniandes.vynilsapp.data.service

import com.uniandes.vynilsapp.data.model.Album

class RetrofitBroker {

    companion object {

        suspend fun getAllAlbums (): List<Album> {
            val request = ApiClient.albums.getAllAlbums()
            return if (request.isSuccessful)
                request.body() ?: listOf()
            else
                listOf()
        }

    }

}