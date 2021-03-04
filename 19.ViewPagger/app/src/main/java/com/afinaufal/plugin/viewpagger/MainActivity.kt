package com.afinaufal.plugin.viewpagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv:ViewPager2 = findViewById(R.id.vp_home)

        val dataFoto = listOf<Int>(
            R.drawable.androidlogo,
            R.drawable.satu,
            R.drawable.dua,
            R.drawable.tiga,
            R.drawable.empat
        )

        val masukan = AdapterView(dataFoto)
        rv.adapter = masukan
    }
}