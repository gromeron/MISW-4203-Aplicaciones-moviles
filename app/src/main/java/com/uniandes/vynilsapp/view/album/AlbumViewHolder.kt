package com.uniandes.vynilsapp.view.album

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.databinding.ItemAlbumBinding

class AlbumViewHolder(view: View): ViewHolder(view) {

    val binding = ItemAlbumBinding.bind(view)

    //val albumName = view.findViewById<TextView>(R.id.tv_album_name)
    //val albumGenre = view.findViewById<TextView>(R.id.tv_album_genre)
    //val albumIcon = view.findViewById<ImageView>(R.id.iv_album_icon)

    fun render(albumModel: Album) {

        //albumName.text = albumModel.name
        //albumGenre.text = albumModel.genre
        //Glide.with(albumIcon.context).load(albumModel.cover).into(albumIcon)
        binding.tvAlbumName.text = albumModel.name
        binding.tvAlbumGenre.text = albumModel.genre
        Glide.with(binding.ivAlbumIcon.context).load(albumModel.cover).into(binding.ivAlbumIcon)

    }
}