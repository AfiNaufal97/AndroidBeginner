package com.afinaufal.plugin.sharedpreference

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var buttonSave:Button
    lateinit var buttonLoad:Button
    lateinit var edtName:EditText
    lateinit var edtNim:EditText
    lateinit var edtKelas:EditText
    lateinit var chkActive:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       buttonSave = findViewById(R.id.btn_save)
        buttonLoad = findViewById(R.id.btn_load)
        edtName = findViewById(R.id.edt_name)
        edtNim = findViewById(R.id.edt_nim)
        edtKelas = findViewById(R.id.edt_kelas)
        chkActive = findViewById(R.id.chc_active)

        prefence()
    }

    private fun prefence(){

        val sharedPrefence = getSharedPreferences("pref", Context.MODE_PRIVATE)
        val edit = sharedPrefence.edit()

        buttonSave.setOnClickListener {
            val nama = edtName.text.toString()
            val nim = edtNim.text.toString()
            val kelas = edtKelas.text.toString()
            val active = chkActive.isChecked

            edit.apply{
                putString("nama", nama)
                putString("nim", nim)
                putString("kelas", kelas)
                putBoolean("active", active)
                apply()
            }
        }


        buttonLoad.setOnClickListener {
            val name = sharedPrefence.getString("nama", null)
            val nim = sharedPrefence.getString("nim", null)
            val kelas = sharedPrefence.getString("kelas", null)
            val active = sharedPrefence.getBoolean("active", false)

            edtName.setText(name)
            edtNim.setText(nim)
            edtKelas.setText(kelas)
            chkActive.isChecked = active
        }
    }



}