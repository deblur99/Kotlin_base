package com.example.practiceapp.Learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceapp.R

class Context : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_context)

        val context : Context = this // activity 의 context
        val applicationContext = getApplicationContext() as Context  // application 의 context
    }
}