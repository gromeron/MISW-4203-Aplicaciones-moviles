package com.uniandes.vynilsapp.view.artist

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Performer

class ArtistAdapter(private val onClickListener: (Performer) -> Unit):
    RecyclerView.Adapter<ArtistViewHolder>() {

    var artistList: List<Performer> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ArtistViewHolder(layoutInflater.inflate(R.layout.item_artist, parent, false))
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        val item = artistList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int {
        return artistList.size
    }
}