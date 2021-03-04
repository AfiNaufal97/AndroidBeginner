package com.afinaufal.plugin.toolbarmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View.inflate
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // efek jika ditekan pada top_menu

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.mt_about -> Toast.makeText(this, "Anda menekan about",Toast.LENGTH_SHORT).show()
            R.id.mt_version -> Toast.makeText(this, "Anda menekan version",Toast.LENGTH_SHORT).show()
            R.id.mt_exit -> Toast.makeText(this, "Anda menekan Exit",Toast.LENGTH_SHORT).show()
            R.id.mt_add_person -> Toast.makeText(this, "Anda menekan Add Person",Toast.LENGTH_SHORT).show()
            R.id.mt_favorit -> Toast.makeText(this, "Anda menekan Favorit",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}