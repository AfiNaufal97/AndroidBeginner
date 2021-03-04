package com.afinaufal.plugin.slitablemenu

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val draw:DrawerLayout = findViewById(R.id.draw_ly)
        val sideMenu:NavigationView = findViewById(R.id.nv_side)


        toggle = ActionBarDrawerToggle(this, draw, R.string.open, R.string.close)
        draw.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        sideMenu.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.tv_nama ->
                    Toast.makeText(this, "Anda menekan Nama", Toast.LENGTH_SHORT).show()
                R.id.tv_kelas ->
                    Toast.makeText(this, "Anda menekan Kelas", Toast.LENGTH_SHORT).show()

                R.id.tv_nim ->
                    Toast.makeText(this, "Anda menekan Nim", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}