package com.uniandes.vynilsapp.view.collector

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Collector
import com.uniandes.vynilsapp.databinding.ItemCollectorBinding

class CollectorViewHolder(view: View): ViewHolder(view) {

    private val binding = ItemCollectorBinding.bind(view)

    //val collectorName = view.findViewById<TextView>(R.id.tv_collector_name)
    //val collectorName = binding.tvCollectorName

    fun render(collectorModel: Collector, onClickListener: (Collector) -> Unit) {

        binding.tvCollectorName.text = collectorModel.name

        itemView.setOnClickListener { onClickListener(collectorModel) }

    }

}