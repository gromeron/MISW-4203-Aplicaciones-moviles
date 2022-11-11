package com.uniandes.vynilsapp.view.artist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Performer

class ArtistAdapter(private val artistList: List<Performer>): RecyclerView.Adapter<ArtistViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ArtistViewHolder(layoutInflater.inflate(R.layout.item_artist, parent, false))
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        val item = artistList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return artistList.size
    }
}