package com.uniandes.vynilsapp.data.model

data class Album(
    val comments: List<Comment>,
    val cover: String,
    val description: String,
    val genre: String,
    val id: Int,
    val name: String,
    val performers: List<Performer>,
    val recordLabel: String,
    val releaseDate: String,
    val tracks: List<Track>
)