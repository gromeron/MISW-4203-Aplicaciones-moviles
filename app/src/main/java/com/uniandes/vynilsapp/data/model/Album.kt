package com.uniandes.vynilsapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Album(
    val id: Int?,
    val name: String,
    val cover: String,
    val releaseDate: Date,
    val description: String,
    val genre: String,
    val recordLabel: String,
    val tracks: List<Track>?,
    val performers: List<Performer>?,
    val comments: List<Comment>?
): Parcelable