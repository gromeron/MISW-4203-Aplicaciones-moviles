package com.uniandes.vynilsapp.view.artist

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.data.model.Performer

class ArtistAdapter(val artistList: List<Performer>): RecyclerView.Adapter<ArtistViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return artistList.size
    }
}