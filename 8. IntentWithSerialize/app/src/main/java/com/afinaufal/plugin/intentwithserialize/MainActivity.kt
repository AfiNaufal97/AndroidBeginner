package com.afinaufal.plugin.intentwithserialize

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt_nama:TextView = findViewById(R.id.edt_nama)
        val edt_nim:TextView = findViewById(R.id.edt_nim)
        val edt_kelas:TextView = findViewById(R.id.edt_kelas)
        val button: Button = findViewById(R.id.btn_submit)


        // jika button di tekan
        button.setOnClickListener {
            // membuat objek untuk menampung data sekaligus dari parselize
            val data = DataParsing(edt_nama.text.toString(), edt_nim.text.toString(), edt_kelas.text.toString())
            Intent(this, SecondActivity::class.java).also{
                it.putExtra("serial", data)
                startActivity(it)
            }
        }

    }
}