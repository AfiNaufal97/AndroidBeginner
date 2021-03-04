package com.afinaufal.plugin.radiobuttonandcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rg:RadioGroup = findViewById(R.id.rg_menu)
        val rNasi:RadioButton = findViewById(R.id.rb_nasi_goreng)
        val rMie:RadioButton = findViewById(R.id.rb_mie_goreng)
        val rBihun:RadioButton = findViewById(R.id.rb_bihun_goreng)

        val sosis:CheckBox = findViewById(R.id.cbSosis)
        val bakso:CheckBox = findViewById(R.id.cbBakso)
        val ati:CheckBox = findViewById(R.id.cbAtiAmpela)

        val pesan:Button = findViewById(R.id.btn_pesan)
        val tvPesanan = findViewById<TextView>(R.id.tv_pil_makanan)
        val tvtoping = findViewById<TextView>(R.id.tv_tooping_pilihan)

        pesan.setOnClickListener {
            // pilih radio button dalam radio group
            val data = rg.checkedRadioButtonId

            // cari ardio button tujuan
            val pilhan = findViewById<RadioButton>(data)

            val topping1 = if(sosis.isChecked)"sosis\n" else ""
            val topping2 = if(bakso.isChecked)"bakso\n" else ""
            val topping3 = if(ati.isChecked)"ati ampela\n" else ""

            tvPesanan.text = pilhan.text
            tvtoping.text = topping1+topping2+topping3
        }

    }
}