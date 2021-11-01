package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        change_activity.setOnClickListener {
            val intent = Intent(this@Intent1, Intent2::class.java)

            // putExtra() 함수로 Key, Value 방식으로 목적지 Intent 에 값을 전달할 수 있다.
            intent.putExtra("number1", 1)
            intent.putExtra("number2", 2)
            startActivity(intent)

            val intent2 = Intent(this@Intent1, Intent2::class.java)
            // Intent 객체의 apply 메서드는 여러 개의 putExtra 를 하나로 묶을 수 있다.
            // 즉, intent2 에 관련된 모든 정보들을 여기에 담음으로써, 가독성이 올라간다.
            intent2.apply {
                this.putExtra("number1", 1)
                this.putExtra("number2", 2)
            }
            startActivity(intent2)
        }
    }
}