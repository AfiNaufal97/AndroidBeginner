package com.afinaufal.plugin.intentservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart: Button = findViewById(R.id.btn_start)
        val buttonStop:Button = findViewById(R.id.btn_stop)
        val tv:TextView = findViewById(R.id.tv_activity)

        buttonStart.setOnClickListener {
            Intent(this, Service::class.java).also {
                startService(it)
                tv.text = "Running...."
            }
        }

        buttonStop.setOnClickListener {
            Service.stopService()
            tv.text = "Stop..."
        }
    }
}