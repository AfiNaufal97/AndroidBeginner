package com.afinaufal.plugin.intentpasingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // tangkap data yang di kirim dari activity utama
        val nama = intent.getStringExtra("nama")
        val nim = intent.getStringExtra("nim")
        val kelas = intent.getStringExtra("kelas")

        // masukan ke text view
        val tv_hasil:TextView = findViewById(R.id.tv_result)

        tv_hasil.text = "Hallo Nama Saya $nama \nnim saya $nim \ndan dari kelas $kelas"

    }
}