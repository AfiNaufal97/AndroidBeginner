package com.afinaufal.plugin.latihan2

import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Transition
import android.view.Menu
import android.view.MenuItem
import android.view.animation.Animation
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.constraintlayout.widget.ConstraintSet
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {
    lateinit var option:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sideMenu = findViewById<DrawerLayout>(R.id.drawer_layout)

        option = ActionBarDrawerToggle(this, sideMenu, R.string.open, R.string.close)
        sideMenu.addDrawerListener(option)
        option.syncState()

        val side = findViewById<NavigationView>(R.id.side_bar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        side.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.btn_map -> Toast.makeText(this, "Anda menekan ${it.title}", Toast.LENGTH_SHORT).show()
            }
            true
        }

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(option.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}