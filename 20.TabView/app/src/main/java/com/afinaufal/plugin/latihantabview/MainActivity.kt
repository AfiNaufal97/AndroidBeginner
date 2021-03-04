package com.afinaufal.plugin.latihantabview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vp:ViewPager2 = findViewById(R.id.vp_halaman_depan)

        val value = listOf<Int>(
            R.drawable.satu,
            R.drawable.dua,
            R.drawable.tiga,
            R.drawable.empat
        )

        val valueResult = AdapterView(value)
        vp.adapter = valueResult

        // tabLaoyout
        val tabView = findViewById<TabLayout>(R.id.tb_tab)
        TabLayoutMediator(tabView, vp){
            tab, position -> tab.text = "tab ${position+1}"
        }.attach()

        // jika tab di tekan / terpilih
        tabView.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "anda ada di tab ke ${tab!!.text}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "anda pindah dari ${tab!!.text}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "anda ada memilih ulang ${tab!!.text}", Toast.LENGTH_SHORT).show()
            }

        })
    }
}