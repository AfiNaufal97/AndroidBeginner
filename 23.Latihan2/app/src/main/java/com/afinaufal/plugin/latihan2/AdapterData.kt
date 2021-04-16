package com.afinaufal.plugin.latihan2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterData(private val data:ArrayList<Data>):RecyclerView.Adapter<AdapterData.ViewData>(){
    inner class ViewData(itemView: View):RecyclerView.ViewHolder(itemView) {
        val no:ImageView = itemView.findViewById(R.id.iv_item_nama)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewData {
        return ViewData(LayoutInflater.from(parent.context).inflate(R.layout.layout_view, parent, false))
    }

    override fun onBindViewHolder(holder: ViewData, position: Int) {
        holder.no.setImageResource(data[position].no)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}