package com.uniandes.vynilsapp.ui.albums

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.model.Album

class ListAdapter (private val listener: OnItemClickListener, private val albums: List<Album>): RecyclerView.Adapter<ListAdapter.ViewHolder> (){

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(viewGroup.context).inflate(R.layout.album_item, viewGroup, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemTitle.text = albums[position].title
        viewHolder.itemDetail.text = albums[position].description
        viewHolder.itemImage.setImageResource(albums[position].image)
    }

    override fun getItemCount(): Int {
        return albums.size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var itemImage:ImageView
        var itemTitle:TextView
        var itemDetail:TextView

        init {
            itemImage = itemView.findViewById(R.id.album_icon)
            itemTitle = itemView.findViewById(R.id.album_name)
            itemDetail = itemView.findViewById(R.id.album_description)

            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val position:Int = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int) {}
    }
}