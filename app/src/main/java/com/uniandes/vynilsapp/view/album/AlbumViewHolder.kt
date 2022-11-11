package com.uniandes.vynilsapp.view.album

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Album

class AlbumViewHolder(view: View) {

    val albumName = view.findViewById<TextView>(R.id.tv_album_name)
    val albumGenre = view.findViewById<TextView>(R.id.tv_album_genre)
    val albumIcon = view.findViewById<ImageView>(R.id.iv_album_icon)

    fun render(albumModel: Album) {

        albumName.text = albumModel.name
        albumGenre.text = albumModel.genre
        // Por ahora no hacemos el icon

    }
}