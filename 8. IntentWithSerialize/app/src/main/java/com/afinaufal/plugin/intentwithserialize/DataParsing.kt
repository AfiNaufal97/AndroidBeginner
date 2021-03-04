package com.afinaufal.plugin.intentwithserialize

import java.io.Serializable

// data classs untuk menampung data parsing
data class DataParsing(
    var nama:String,
    var nim:String,
    var kelas:String
):Serializable // ini untukmembuat semuanya terhubung ketika di intent