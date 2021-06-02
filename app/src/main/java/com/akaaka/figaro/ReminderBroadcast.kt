package com.akaaka.figaro

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

public class ReminderBroadcast : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val builder = NotificationCompat.Builder(context!!, "notifyFigaro")
            .setSmallIcon(R.drawable.hairdryer)
            .setContentTitle("Figaro")
            .setContentText("Your appointment is coming up soon!")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        val notificationManager = NotificationManagerCompat.from(context)

        notificationManager.notify(200, builder.build())
    }
}