package com.uniandes.vynilsapp.view.album

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Album

class AlbumAdapter(/*private val albumList: List<Album>*/): RecyclerView.Adapter<AlbumViewHolder>() {

    var albumList: List<Album> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlbumViewHolder(layoutInflater.inflate(R.layout.item_album, parent, false))
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val item = albumList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

}