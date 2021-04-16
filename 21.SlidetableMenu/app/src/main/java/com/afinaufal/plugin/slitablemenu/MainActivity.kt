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

    lateinit var isiDrawer:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawer:DrawerLayout = findViewById(R.id.draw_ly)
        val valueMenu:NavigationView = findViewById(R.id.nv_side)

        // jika tombol menu samping di tekan akan muncul
        isiDrawer = ActionBarDrawerToggle(this, drawer,R.string.open, R.string.close)

        // menambahkan isiDrawer ke dalam drawer
        drawer.addDrawerListener(isiDrawer)

        // synkronisasi bagian dalam atau action drawer
        isiDrawer.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        valueMenu.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.tv_nama -> Toast.makeText(this, "Anda menekan ${it.title}",Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(isiDrawer.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}