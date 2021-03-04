package com.afinaufal.plugin.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button atau tombol

        // inisisalisasi button
        val button = findViewById<Button>(R.id.btn_tekan)
        var masukan:Int = 0
        val tv:TextView = findViewById(R.id.tv_hasil)

        // jika button ditekan, akan menampilkan berapa kali di tekan
        button.setOnClickListener {
            masukan++
            tv.text = masukan.toString()
        }
    }
}