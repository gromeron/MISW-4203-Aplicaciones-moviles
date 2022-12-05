package com.uniandes.vynilsapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Collector(
    val id: Int,
    val name: String,
    val telephone: String,
    val email: String,
    val collectorAlbums: List<CollectorAlbum>?,
    val comments: List<Comment>?,
    val favoritePerformers: List<FavoritePerformer>?
): Parcelable