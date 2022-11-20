package com.uniandes.vynilsapp.view.artist

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Performer
import com.uniandes.vynilsapp.databinding.ItemArtistBinding

class ArtistViewHolder(view: View): ViewHolder(view) {

    private val binding = ItemArtistBinding.bind(view)

    fun render(artistModel: Performer, onClickListener: (Performer) -> Unit) {

        binding.tvArtistName.text = artistModel.name
        Glide.with(binding.ivArtistIcon.context).load(artistModel.image)
            .into(binding.ivArtistIcon)

        itemView.setOnClickListener { onClickListener(artistModel) }

    }

}