package com.afinaufal.plugin.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = arrayListOf<Todo>(
            Todo("Afi", false),
            Todo("Rizal", false),
            Todo("Niko", false)
        )

        // memsukan data ke dapater
        val dataAdapter = TodoAdapter(data)
        recyclerview(dataAdapter)
        addData(data, dataAdapter)

    }

    private fun recyclerview(masukan:TodoAdapter){
        val rv = findViewById<RecyclerView>(R.id.rv_home)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = masukan
    }

    private fun addData(data:ArrayList<Todo>, adapter:TodoAdapter){
        val button: Button = findViewById(R.id.btn_input)
        val edt:EditText = findViewById(R.id.edt_input)
        button.setOnClickListener {
            val masukan = edt.text.toString()
            val objekBaru = Todo(masukan, false)
            data.add(objekBaru)
            adapter.notifyItemInserted(data.size-1)
            edt.setText("")
        }

    }
}