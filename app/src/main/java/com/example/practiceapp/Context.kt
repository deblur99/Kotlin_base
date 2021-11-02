package com.example.practiceapp

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Context : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)

        val context : Context = this // activity 의 context
        val applicationContext = getApplicationContext() as Context  // application 의 context
    }
}