package com.uniandes.vynilsapp.view.album

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Album

class AlbumAdapter(private val onClickListener:(Album) -> Unit):
    RecyclerView.Adapter<AlbumViewHolder>() {

    //var onAlbumSelected: ((id: Int) -> Unit)? = null

    var albumList: List<Album> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    /*fun onClickAlbum(position: Int) {
        onAlbumSelected?.invoke(albumList[position].id!!)
    }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlbumViewHolder(layoutInflater.inflate(R.layout.item_album, parent, false))
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val item = albumList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

}