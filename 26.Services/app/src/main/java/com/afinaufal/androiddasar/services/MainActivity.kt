package com.afinaufal.androiddasar.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_service)
        val buttonStop: Button = findViewById(R.id.btn_service_stop)
        val tv:TextView = findViewById(R.id.tv_activity)

        // intent pinda ke activity Service
        // tetapi tidak pindah activity hanya menjalankan sevice saja
        button.setOnClickListener {
            Intent(this, Service::class.java).also {
                startService(it)
                tv.text = "Activity Running...."
            }
        }

        // jika button di tekan lagi akan berhenti
        buttonStop.setOnClickListener {
            Service.stopService()
            tv.text = "Activity Stop"
        }

    }
}