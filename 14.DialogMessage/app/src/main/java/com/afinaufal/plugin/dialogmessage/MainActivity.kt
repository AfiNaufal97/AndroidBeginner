package com.afinaufal.plugin.dialogmessage

import android.app.Application
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.btn_1)
        val button2: Button = findViewById(R.id.btn_2)
        val button3:Button = findViewById(R.id.btn_3)

        button1.setOnClickListener {
            message1()
        }

        button2.setOnClickListener {
            message2()
        }

        button3.setOnClickListener {
            message3()
        }
    }


   private fun message1(){
       val message1 = AlertDialog.Builder(this)
               .setTitle("Dialog Message Type1")
               .setMessage("Apakah Anda akan Menambahkan Nama Ini ?")
               .setIcon(R.drawable.ic_baseline_person_add_24)
               .setPositiveButton("Yes"){ _, _ ->
                    Toast.makeText(this, "Anda Menambahkan Nama Tersebut", Toast.LENGTH_SHORT).show()
               }
               .setNegativeButton("No"){ _, _ ->
                   Toast.makeText(this, "Anda Tidak Nama Tersebut", Toast.LENGTH_SHORT).show()
               }

       message1.show()
   }


    private fun message2(){
        val options = arrayOf<String>("Options 1", "Options 2", "Options 3")
        val message2 = AlertDialog.Builder(this)
                .setTitle("Option User")
                .setSingleChoiceItems(options, 0){ _, i ->
                    Toast.makeText(this, "Anda memilih ${options[i]}", Toast.LENGTH_SHORT).show()
                }
                .setPositiveButton("Yes"){ _, _ ->
                    Toast.makeText(this, "Pilihan Anda Disimpan", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("No"){ _, _ ->
                    Toast.makeText(this, "Close", Toast.LENGTH_SHORT).show()
                }
        message2.show()
    }

    private fun message3(){
        val options = arrayOf("Options 1", "Options 2", "Opstions 3")
        val message3 = AlertDialog.Builder(this)
                .setTitle("Message 3")
                .setMultiChoiceItems(options, booleanArrayOf(false, false, false)){
                    _, i, chose->
                    if(chose){
                        Toast.makeText(this, "you checked ${options[i]}", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this, "you unchecked ${options[i]}", Toast.LENGTH_SHORT).show()
                    }
                }

                .setPositiveButton("yes"){ _, i->
                    Toast.makeText(this, "you save checked", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("no"){ _, i->
                    Toast.makeText(this, "you don't save checked", Toast.LENGTH_SHORT).show()
                }
        message3.show()
    }
}