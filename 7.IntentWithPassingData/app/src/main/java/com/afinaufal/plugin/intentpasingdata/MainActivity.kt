package com.afinaufal.plugin.intentpasingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt_nama:EditText = findViewById(R.id.edt_nama)
        val edt_nim:EditText = findViewById(R.id.edt_nim)
        val edt_kelas:EditText = findViewById(R.id.edt_kelas)
        val button: Button = findViewById(R.id.btn_submit)

        // intent with passing data
        button.setOnClickListener {
            Intent(this, SecondActivity::class.java).also{
                it.putExtra("nama", edt_nama.text.toString())
                it.putExtra("nim", edt_nim.text.toString())
                it.putExtra("kelas", edt_kelas.text.toString())
                startActivity(it)
            }
        }
    }
}