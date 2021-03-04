 package com.afinaufal.plugin.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.view.ViewDebug
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.content.res.ColorStateListInflaterCompat.inflate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_toast)
        val idLy = findViewById<ViewGroup>(R.id.ly_toast)

        btn.setOnClickListener {
//            Toast.makeText(this, "Toast View", Toast.LENGTH_SHORT).show()

            // toast dengan modifikasi
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.toast_layout, idLy)
                show()
            }
        }

    }
}