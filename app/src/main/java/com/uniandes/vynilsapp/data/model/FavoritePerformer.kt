package com.uniandes.vynilsapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FavoritePerformer(
    val id: Int,
    val name: String,
    val image: String,
    val description: String,
    val birthDate: String,
): Parcelable