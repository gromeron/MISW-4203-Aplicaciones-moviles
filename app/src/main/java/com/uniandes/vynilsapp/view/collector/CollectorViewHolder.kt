package com.uniandes.vynilsapp.view.collector

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Collector

class CollectorViewHolder(view: View): ViewHolder(view) {

    val collectorName = view.findViewById<TextView>(R.id.tv_collector_name)

    fun render(collectorModel: Collector) {

        collectorName.text = collectorModel.name;

    }

}