package com.uniandes.vynilsapp.view.album

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.databinding.ItemAlbumBinding

class AlbumViewHolder(view: View): ViewHolder(view) {

    private val binding = ItemAlbumBinding.bind(view)

    fun render(albumModel: Album, onClickListener:(Album) -> Unit) {

        binding.tvAlbumName.text = albumModel.name
        binding.tvAlbumGenre.text = albumModel.genre
        Glide.with(binding.ivAlbumIcon.context).load(albumModel.cover)
            .into(binding.ivAlbumIcon)

        itemView.setOnClickListener { onClickListener(albumModel) }

    }
}