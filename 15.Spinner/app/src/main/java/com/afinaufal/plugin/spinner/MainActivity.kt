 package com.afinaufal.plugin.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        chooseMounth()
        adapterSpinner()

    }


    // spinner dengan adapter
    // ketika membuat spinner tanpa entries
    fun adapterSpinner(){
        val data = listOf<String>("First", "Second", "Thrird")
        val adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, data)
        val nameMouth = findViewById<Spinner>(R.id.sp_mounth)
        nameMouth.adapter = adapter
        nameMouth.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(applicationContext, "you choose ${parent?.getItemAtPosition(position)}", Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }


    fun chooseMounth(){

        val nameMouth = findViewById<Spinner>(R.id.sp_mounth)
        nameMouth.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(applicationContext, "you choose ${parent?.getItemAtPosition(position)}", Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}