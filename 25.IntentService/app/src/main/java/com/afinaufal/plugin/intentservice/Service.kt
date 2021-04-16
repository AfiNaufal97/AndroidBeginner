package com.afinaufal.plugin.intentservice

import android.app.IntentService
import android.content.Intent
import android.util.Log

class Service:IntentService("Intent Service") {

    init{
        instance = this
    }

    companion object{
        private lateinit var instance:Service
        var isRunning = false

        fun stopService(){
            Log.d("MyIntentService", "Service is Stopping ....")
            isRunning = false
            instance.stopSelf()
        }
    }

    override fun onHandleIntent(intent: Intent?) {
        try{
            isRunning = true
            while(isRunning){
                Log.d("MyIntentService", "Service Is Running...")
                Thread.sleep(1000)
            }
        }catch(e:InterruptedException){
            Thread.currentThread().interrupt()
        }
    }
}