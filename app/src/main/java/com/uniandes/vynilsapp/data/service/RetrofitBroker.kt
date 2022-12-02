package com.uniandes.vynilsapp.data.service

import android.util.Log
import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.data.model.Collector
import com.uniandes.vynilsapp.data.model.Performer
import com.uniandes.vynilsapp.data.model.Track

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

        suspend fun createAlbum(album: Album): Album? {
            val request = ApiClient.albums.createAlbum(album)
            if (request.isSuccessful){
                Log.e("SuccessCrearAlbum", request.toString())
                return request.body()
            }else{
                Log.e("ErrorCrearAlbum", request.toString())
                return null
            }
        }

        // Tracks
        suspend fun createTrack(track: Track): Track? {
            val request = ApiClient.tracks.createTrack(track)
            if (request.isSuccessful){
                Log.e("SuccessCrearTrack", request.toString())
                return request.body()
            }else{
                Log.e("ErrorCrearTrack", request.toString())
                return null
            }
        }

        // Artists
        suspend fun getAllArtists (): List<Performer> {
            val request = ApiClient.artists.getAllArtists()
            return if (request.isSuccessful)
                request.body() ?: listOf()
            else
                listOf()
        }

        // Collectors
        suspend fun getAllCollectors (): List<Collector> {
            val request = ApiClient.collectors.getAllCollectors()
            return if (request.isSuccessful)
                request.body() ?: listOf()
            else
                listOf()
        }

    }

}