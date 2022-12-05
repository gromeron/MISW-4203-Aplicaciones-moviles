package com.uniandes.vynilsapp.view.collector

import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Collector
import com.uniandes.vynilsapp.view.collector.CollectorViewHolder

class CollectorAdapter(private val onClickListener: (Collector) -> Unit):
    RecyclerView.Adapter<CollectorViewHolder>() {

    var collectorList: List<Collector> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectorViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CollectorViewHolder(layoutInflater.inflate(R.layout.item_collector, parent, false))
    }

    override fun onBindViewHolder(holder: CollectorViewHolder, position: Int) {
        val item = collectorList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int {
        return collectorList.size
    }
}