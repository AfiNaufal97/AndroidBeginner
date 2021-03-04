package com.afinaufal.plugin.latihantabview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AdapterView(private var masukan:List<Int>):RecyclerView.Adapter<AdapterView.ViewValue>() {
    inner class ViewValue(itemView: View):RecyclerView.ViewHolder(itemView) {
        val photo = itemView.findViewById<ImageView>(R.id.iv_view_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewValue {
        return ViewValue(LayoutInflater.from(parent.context).inflate(R.layout.view, parent, false))
    }

    override fun onBindViewHolder(holder: ViewValue, position: Int) {
        val foto = masukan[position]
        holder.photo.setImageResource(foto)
    }

    override fun getItemCount(): Int {
        return masukan.size
    }


}