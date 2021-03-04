package com.afinaufal.plugin.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LinearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        // layout yang hanya bisa menampilkan tampilan secara vertikal dan horizontal
        // clik ctrl+ click (activity_linear_layout) untuk menuju pada tampilan linear layout
    }
}