package com.afinaufal.plugin.latihan2

object ObjekData {

    val nama = arrayListOf<String>(
            "Afi",
            "Naufal",
            "Setiawan"
    )

    val no = arrayListOf<Int>(
            R.drawable.ic_baseline_message_24,
            R.drawable.ic_baseline_person_add_24,
            R.drawable.ic_baseline_home_24
    )

    val valueData:ArrayList<Data>
    get() {
        val value = arrayListOf<Data>()
        for(i in nama.indices){
            val data = Data()
            data.nama = nama[i]
            data.no = no[i]
            value.add(data)
        }
        return value
    }
}