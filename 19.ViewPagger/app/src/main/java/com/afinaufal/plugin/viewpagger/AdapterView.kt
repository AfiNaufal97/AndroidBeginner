package com.afinaufal.plugin.viewpagger

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AdapterView(val data:List<Int>):RecyclerView.Adapter<AdapterView.ViewAdapter>() {
    inner class ViewAdapter(itemView: View):RecyclerView.ViewHolder(itemView) {
        val img = itemView.findViewById<ImageView>(R.id.iv_foto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewAdapter {
       return ViewAdapter(LayoutInflater.from(parent.context).inflate(R.layout.layout_view_pagger, parent, false))
    }

    override fun onBindViewHolder(holder: ViewAdapter, position: Int) {
        val image = data[position]
        holder.img.setImageResource(image)
    }

    override fun getItemCount(): Int {
       return data.size
    }
}