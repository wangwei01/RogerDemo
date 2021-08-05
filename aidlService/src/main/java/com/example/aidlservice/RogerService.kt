package com.example.aidlservice

import android.app.Service
import android.content.Intent
import android.os.IBinder

class RogerService : Service() {

    override fun onBind(p0: Intent?): IBinder {
        return binder
    }

    private val binder = object : IRogerAidlInterface.Stub() {

        override fun add(a: Int, b: Int): Int {
            return a + b;
        }


    }


}