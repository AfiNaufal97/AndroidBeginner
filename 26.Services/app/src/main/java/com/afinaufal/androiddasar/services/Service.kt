package com.afinaufal.androiddasar.services

import android.app.IntentService
import android.content.Intent
import android.util.Log

class Service:IntentService("Intent Service") {
    init {
        instance = this
    }

    companion object{
        private lateinit var instance:Service
        var isRunning = false

        fun stopService(){
            Log.d("MyIntentService", "Service is Stop...")
            isRunning = false
            instance.stopSelf()
        }
    }

    override fun onHandleIntent(intent: Intent?) {
        try{
            isRunning = true
            while(isRunning) run {
                Log.d("MyIntentService", "Service is Running...")
                Thread.sleep(1000L)
            }
        }catch (e:InterruptedException){
            Thread.currentThread().interrupt()
        }
    }

}