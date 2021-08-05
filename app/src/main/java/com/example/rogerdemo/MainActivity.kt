package com.example.rogerdemo

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.widget.TextView
import com.example.aidlservice.IRogerAidlInterface
import com.example.rogerdemo.JNI.JniUtils
import com.example.rogernativelib.NativeLib

class MainActivity : AppCompatActivity() {

    private lateinit var aidl: IRogerAidlInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindRogerService()
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tv_test).text = JniUtils.getStringFromNDK().toString()
        findViewById<TextView>(R.id.tv_test).text = NativeLib().stringFromJNI()
        findViewById<TextView>(R.id.tv_test).text = aidl.add(1, 2).toString()
    }

    private fun bindRogerService() {
        val intent = Intent()
        intent.component =
            ComponentName("com.example.aidlservice", "com.example.aidlservice.RogerService")
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE)
    }

    private val serviceConnection = object : ServiceConnection {
        override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
            aidl = IRogerAidlInterface.Stub.asInterface(p1)
        }

        override fun onServiceDisconnected(p0: ComponentName?) {
        }

    }
}