package com.uniandes.vynilsapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PerformerPrize(
    val id: Int,
    val premiationDate: String
) : Parcelable