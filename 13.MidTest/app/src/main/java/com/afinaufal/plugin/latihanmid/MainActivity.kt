package com.afinaufal.plugin.latihanmid

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edt_nama = findViewById<EditText>(R.id.edt_nama)
        click(edt_nama)
        clikGthub()
        clickMulti()
    }

    private fun clickMulti(){
        val button:Button = findViewById(R.id.btn_multi)

        button.setOnClickListener {
            val options = arrayOf<String>("Satu", "Dua", "tiga")
            val message = AlertDialog.Builder(this)
                    .setTitle("Alert Mutli choose")
                    .setMultiChoiceItems(options, booleanArrayOf(false, false, false)){
                        _, i, choose ->
                        if(choose){
                            Toast.makeText(this, " checked ${options[i]}", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(this, " unchecked ${options[i]}", Toast.LENGTH_SHORT).show()
                        }
                    }
            message.show()
        }
    }

    private fun clikGthub(){
        val button:Button = findViewById(R.id.btn_github)
        button.setOnClickListener {
            Intent(Intent.ACTION_VIEW).apply {
                setData(Uri.parse("https://github.com"))
                startActivity(this)
            }
        }
    }

    private fun click(masukan:EditText){
        val button:Button = findViewById(R.id.btn_add)

        // dialog message
        button.setOnClickListener {
            val options = arrayOf<String>("Satu", "Dua", "Tiga")
            val message = AlertDialog.Builder(this)
                .setTitle("Alert 1")
                .setSingleChoiceItems(options, 0){_,i
                    ->
                    Log.d("pilihan", "Hallo")
                    Toast.makeText(this, "Anda menekan ${options[i]}", Toast.LENGTH_SHORT).show()
                }
            message.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_top,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.btn_person -> startActivity(Intent(this, AboutActivity::class.java))
        }
        return true
    }
}