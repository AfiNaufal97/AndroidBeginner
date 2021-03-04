package com.afinaufal.plugin.implicitintent

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_ambil_foto)
        val foto:ImageView = findViewById(R.id.iv_image)

        // jika button dtekan
        button.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also{
                it.type = "image/*"
                startActivityForResult(it,0)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val foto:ImageView = findViewById(R.id.iv_image)
        if(resultCode == Activity.RESULT_OK && requestCode == 0){
            val uri = data?.data
            foto.setImageURI(uri)
        }
    }
}