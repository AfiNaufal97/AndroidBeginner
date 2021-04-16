
package com.afinaufal.plugin.notification

import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class MainActivity : AppCompatActivity() {

    val CHANELID = "chanelID"
    val CHANELNAME = "chanelName"
    val NOTIFYID = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notificationFunction()

        val intent = Intent(this, MainActivity::class.java)
        val pendingIntent = TaskStackBuilder.create(this).run{
            addNextIntentWithParentStack(intent)
            getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)
        }

        // membuat isi notifikasi
        val notification = NotificationCompat.Builder(this, CHANELID)
                .setContentTitle("Notifikasi App")
                .setContentText("Ada notifikasi baru")
                .setSmallIcon(R.drawable.ic_baseline_star_24)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent)
                .build()


        val notifyManager = NotificationManagerCompat.from(this)

        val button: Button = findViewById(R.id.btn_notify)

        button.setOnClickListener {
            notifyManager.notify(NOTIFYID, notification)
        }

    }

    // membuat kerangka notifikasi
    private fun notificationFunction(){
        // cek type sdk dan android
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val chanel = NotificationChannel(CHANELID, CHANELNAME, NotificationManager.IMPORTANCE_DEFAULT).apply {
                lightColor = Color.GREEN
                enableLights(true)
            }

            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(chanel)
        }
    }
}