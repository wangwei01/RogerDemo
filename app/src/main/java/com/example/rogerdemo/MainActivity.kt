package com.example.rogerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.rogernativelib.NativeLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tv_test).text = JniUtils.getStringFromNDK().toString()
        findViewById<TextView>(R.id.tv_test).text = NativeLib().stringFromJNI()
    }
}