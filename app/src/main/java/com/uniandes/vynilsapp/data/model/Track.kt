package com.uniandes.vynilsapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Track(
    val id: Int?,
    val name: String,
    val duration: String
) : Parcelable