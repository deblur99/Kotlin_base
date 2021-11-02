package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity(), FragmentOne.OnDataPassListener {

    // 추상메서드 구현
    override fun onDataPass(data: String?) {
        Log.d("pass", data.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("life_cycle", "onCreate")

        // 범위 밖에서 fragment 객체 만들어서 이벤트 리스너에서 사용
        val fragmentOne: FragmentOne = FragmentOne()

        // fragment 에 data 를 넣어주는 방법
        val bundle : Bundle = Bundle()
        bundle.putString("hello", "hello")
        fragmentOne.arguments = bundle

        button.setOnClickListener {
            // fragment 를 동적으로 작동하기
            // fragment 붙이는 방법 replace/add
            val fragmentManager = supportFragmentManager // AppCompatActivity 를 상속받아서 바로 사용 가능

            // Transaction
            // 작업의 단위 -> 시작과 끝이 있다.
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentOne)
            fragmentTransaction.commit()

            // Transaction 끝내는 법 -> commit 쓰는 게 안정적임
            // commit - 시간 될 때 끝
            // commitNow - 지금 당장 끝
        }

        button2.setOnClickListener {
            // Fragment remove/detach 하는 방법
            // remove 는 뷰를 제거해도 다시 붙일 수 있고,
            // detach 는 다시 붙일 수 없다.
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
//            fragmentTransaction.detach(fragmentOne)
            fragmentTransaction.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle", "onDestroy")
    }
}