package com.uniandes.vynilsapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Performer(
    val id: Int,
    val name: String,
    val image: String,
    val description: String,
    val birthDate: String?,
    val albums: List<Album>?,
    val performerPrizes: List<PerformerPrize>?,
    val creationDate: String?
) : Parcelable
