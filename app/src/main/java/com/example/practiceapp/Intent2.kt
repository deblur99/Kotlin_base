package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        // intent 로부터 전달받은 값 불러오기
        val number1 = intent.getIntExtra("number1", -1)
        val number2 = intent.getIntExtra("number2", -1)

        Log.d("number1", number1.toString())
        Log.d("number2", number2.toString())
    }
}