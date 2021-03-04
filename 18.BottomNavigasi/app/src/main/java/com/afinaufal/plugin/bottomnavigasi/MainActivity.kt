package com.afinaufal.plugin.bottomnavigasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mb = findViewById<BottomNavigationView>(R.id.btm_nav)
        val fragment1 = Fragment1()
        val fragment2 = Fragment2()
        val fragment3 = Fragment3()
        setCurrentFragment(fragment1)


        // menmabhakan notifikasi
        mb.getOrCreateBadge(R.id.nb_message).apply {
            number = 10
            isVisible = true
        }


        mb.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nb_home -> setCurrentFragment(fragment1)
                R.id.nb_message -> setCurrentFragment(fragment2)
                R.id.nb_profile -> setCurrentFragment(fragment3)
            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) =
            supportFragmentManager.beginTransaction().also {
                it.replace(R.id.frame_layout, fragment)
                it.commit()
            }
}