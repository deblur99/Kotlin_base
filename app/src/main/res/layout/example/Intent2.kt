package com.example.practiceapp.Learn

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.practiceapp.R
import kotlinx.android.synthetic.main.activity_intent2.*

class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        result.setOnClickListener {
            // intent 로부터 전달받은 값 불러오기
            val number1 = intent.getIntExtra("number1", -1)
            val number2 = intent.getIntExtra("number2", -1)

            Log.d("number1", number1.toString())
            Log.d("number2", number2.toString())

            val result = number1 + number2

            val resultIntent = Intent()
            resultIntent.apply {
                resultIntent.putExtra("result", result)
            }

            setResult(Activity.RESULT_OK, resultIntent)
            finish() // activity 종료

//            Intent2 종료
//            Intent1 남음
        }
    }
}