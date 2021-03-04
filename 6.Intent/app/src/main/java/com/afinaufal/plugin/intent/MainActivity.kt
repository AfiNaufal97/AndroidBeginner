package com.afinaufal.plugin.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_to_second_activity)

        // jika button ditekan akan menimbulkan aksi
        button.setOnClickListener {
            Intent(this, ActivitySecond::class.java).also {
                startActivity(it)
            }
        }
    }
}