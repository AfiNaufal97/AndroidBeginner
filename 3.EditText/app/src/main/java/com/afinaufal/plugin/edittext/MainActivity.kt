package com.afinaufal.plugin.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EdgeEffect
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firtsName:EditText = findViewById(R.id.firtsName)
        val lastName:EditText = findViewById(R.id.lastName)
        val result:TextView = findViewById(R.id.tv_result)
        val input: Button = findViewById(R.id.btn_input)


        // ambil data dari edit test dan di masukan ke text view
        // jika button di tekan
        input.setOnClickListener {
            result.text = firtsName.text.toString() + " " +lastName.text.toString()

            // setelah itu kososngkan kembali edite text
            firtsName.setText("")
            lastName.setText("")
        }


    }
}