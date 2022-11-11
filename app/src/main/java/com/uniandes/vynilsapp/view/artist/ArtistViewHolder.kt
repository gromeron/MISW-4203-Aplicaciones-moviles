package com.uniandes.vynilsapp.view.artist

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Performer

class ArtistViewHolder(view: View): ViewHolder(view) {

    val artistName = view.findViewById<TextView>(R.id.tv_artist_name)
    val artistIcon = view.findViewById<ImageView>(R.id.iv_artist_icon)

    fun render(artistModel: Performer) {

        artistName.text = artistModel.name
        Glide.with(artistIcon.context).load(artistModel.image).into(artistIcon)

    }

}