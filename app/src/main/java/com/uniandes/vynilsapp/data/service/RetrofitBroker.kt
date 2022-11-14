package com.uniandes.vynilsapp.data.service

import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.data.model.Performer

class RetrofitBroker {

    companion object {

        // Albums
        suspend fun getAllAlbums (): List<Album> {
            val request = ApiClient.albums.getAllAlbums()
            return if (request.isSuccessful)
                request.body() ?: listOf()
            else
                listOf()
        }

        // Artists
        suspend fun getAllArtists (): List<Performer> {
            val request = ApiClient.artists.getAllArtists()
            return if (request.isSuccessful)
                request.body() ?: listOf()
            else
                listOf()
        }

    }

}