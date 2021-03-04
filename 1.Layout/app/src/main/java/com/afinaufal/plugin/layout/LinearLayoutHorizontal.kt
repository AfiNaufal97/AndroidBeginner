package com.afinaufal.plugin.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LinearLayoutHorizontal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout_horizontal)

        // layout yang hanya bisa menampilkan tampilan secara vertikal dan horizontal
        // clik ctrl+ click (activity_linear_layout_horizontal) untuk menuju pada tampilan layout
    }
}