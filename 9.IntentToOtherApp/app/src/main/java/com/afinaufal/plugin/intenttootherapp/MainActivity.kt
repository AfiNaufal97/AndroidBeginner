package com.afinaufal.plugin.intenttootherapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_to_ig)

        // jika button di tekan akan ke instagram
        button.setOnClickListener {
            Intent(Intent.ACTION_VIEW).also {
                it.setData(Uri.parse("https://github.com/AfiNaufal97"))
                startActivity(it)
            }
        }
    }
}