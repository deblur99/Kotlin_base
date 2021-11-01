package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
// xml 내 모든 id에 import
import kotlinx.android.synthetic.main.activity_lisntener2.*

class Lisntener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lisntener2)

        // 뷰를 activity 로 가져오는 방법
        //val textView : TextView = findViewById(R.id.hello)

        // xml 을 import 해서 가져온다.
        // hello.d

        // 익명함수 사용 (3번에서 1번으로 갈수록 간소하다)
        // 1) 람다 방식
        hello.setOnClickListener {
            Log.d("click", "Click")
        }

        // 2) 익명 함수 방식 -> 인자로 람다 함수인 콜백 함수를 받는다.
        hello.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("click", "Click")
            }
        })

        // 3) 이벤트 리스너의 이름이 필요한 경우 (재사용해야 할 경우)
        val click = object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (hello.text.equals("안녕하세요")) {
                    hello.setText("Hello world")
                } else {
                    hello.setText("안녕하세요")
                }
            }
        }

        // 이벤트 리스너가 겹칠 경우, 가장 마지막에 정의된 것이 적용된다.
        hello.setOnClickListener(click);

        // 뷰를 조작하는 함수들
        hello.setText("안녕하세요")
    }
}