package com.afinaufal.plugin.intentwithserialize

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val textView:TextView = findViewById(R.id.tv_result)

        // menangkap data
        val dataHasil = intent.getSerializableExtra("serial") as DataParsing
        textView.text = "hallo saya ${dataHasil.nama} \nnim ${dataHasil.nim} \ndari kelas ${dataHasil.kelas}"
    }
}