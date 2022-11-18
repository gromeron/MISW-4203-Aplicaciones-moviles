package com.uniandes.vynilsapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CollectorAlbum(
    val id: Int,
    val price: Int,
    val status: String
): Parcelable