package com.afinaufal.plugin.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.concurrent.fixedRateTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1:Fragment1 = Fragment1()
        val fragment2:Fragment2 = Fragment2()
        val button1: Button = findViewById(R.id.btn_fragment1)
        val button2: Button = findViewById(R.id.btn_fragment2)
        supportFragmentManager.beginTransaction().also {
            it.replace(R.id.frm_data, fragment1)
            it.commit()
        }

        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().also {
                it.replace(R.id.frm_data, fragment1)
                it.commit()
            }
        }

        button2.setOnClickListener {
            supportFragmentManager.beginTransaction().also {
                it.replace(R.id.frm_data, fragment2)
                it.commit()
            }
        }


    }
}