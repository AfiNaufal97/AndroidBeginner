package com.afinaufal.plugin.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(private val masukan:ArrayList<Todo>):RecyclerView.Adapter<TodoAdapter.DataTodoAdapter>(){
    inner class DataTodoAdapter(itemview: View):RecyclerView.ViewHolder(itemview){
        val nama = itemview.findViewById<TextView>(R.id.tv_name_item)
        val check = itemview.findViewById<CheckBox>(R.id.cb_option)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataTodoAdapter {
        return DataTodoAdapter(LayoutInflater.from(parent.context).inflate(R.layout.todo_item, parent, false))
    }

    override fun onBindViewHolder(holder: DataTodoAdapter, position: Int) {
        holder.also {
            it.nama.text = masukan[position].nama
            it.check.isChecked = masukan[position].isChecked
        }
    }

    override fun getItemCount(): Int {
       return masukan.size
    }
}