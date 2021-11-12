package com.example.practiceapp.Learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.practiceapp.R
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

//        val textView : TextView = findViewById<TextView>(R.id.hello) -> in Java
        hello.setOnClickListener{
            Log.d("click","Click!!")
        }

        // 람다 함수는 기존 함수에 비해 매우 간편하다.
        hello.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("click", "Click!!")
            }
        })

        // 풀어 쓰기 -> 람다 함수는 이러한 과정을 축약한다.
        val click = object: View.OnClickListener{
            override fun onClick(p0: View?) {
                if (hello.text == "hello") {
                    hello.setText("안녕하세요")
                    image.setImageResource(R.drawable.ic_baseline_home_24)
                } else {
                    hello.setText("hello")
                    image.setImageResource(R.drawable.gradient)
                }
            }
        }

        hello.setOnClickListener(click)

        // 뷰를 조작하는 함수들
    }
}