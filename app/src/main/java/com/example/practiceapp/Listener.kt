package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        var sum: Int = 0
        var operand: Int = 0

        var operand_String: String = ""

        var isOperandNow: Boolean = false
        var isPressed: Boolean = false

        fun eraseForwardZero() {
            if (result_indicator.text.toString().equals("0")) {
                result_indicator.setText("")
            }
        }

        fun eraseBeforeNewOperand() {
            if (!isPressed) {
                result_indicator.setText("")
                isPressed = true
            }
        }

        zero.setOnClickListener {
            eraseBeforeNewOperand()
            eraseForwardZero()
            result_indicator.setText(result_indicator.text.toString() + "0")
        }

        one.setOnClickListener {
            eraseBeforeNewOperand()
            eraseForwardZero()
            result_indicator.setText(result_indicator.text.toString() + "1")
        }

        two.setOnClickListener {
            eraseBeforeNewOperand()
            eraseForwardZero()
            result_indicator.setText(result_indicator.text.toString() + "2")
        }

        three.setOnClickListener {
            eraseBeforeNewOperand()
            eraseForwardZero()
            result_indicator.setText(result_indicator.text.toString() + "3")
        }

        four.setOnClickListener {
            eraseBeforeNewOperand()
            eraseForwardZero()
            result_indicator.setText(result_indicator.text.toString() + "4")
        }

        five.setOnClickListener {
            eraseBeforeNewOperand()
            eraseForwardZero()
            result_indicator.setText(result_indicator.text.toString() + "5")
        }

        six.setOnClickListener {
            eraseBeforeNewOperand()
            eraseForwardZero()
            result_indicator.setText(result_indicator.text.toString() + "6")
        }

        seven.setOnClickListener {
            eraseBeforeNewOperand()
            eraseForwardZero()
            result_indicator.setText(result_indicator.text.toString() + "7")
        }

        eight.setOnClickListener {
            eraseBeforeNewOperand()
            eraseForwardZero()
            result_indicator.setText(result_indicator.text.toString() + "8")
        }

        nine.setOnClickListener {
            eraseBeforeNewOperand()
            eraseForwardZero()
            result_indicator.setText(result_indicator.text.toString() + "9")
        }

        CA.setOnClickListener {
            sum = 0
            result_indicator.setText(sum.toString())
        }

        plus.setOnClickListener {
            operand = result_indicator.text.toString().toInt()
            sum += operand

            if (!isOperandNow) { // op1
                result_indicator.setText("0")
                isOperandNow = true

            } else { // op2
                result_indicator.setText(sum.toString())
                isOperandNow = false
                isPressed = false
            }

            Log.d("sum", sum.toString())

            operand = 0
        }
    }
}

/*
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
         */