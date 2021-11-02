package com.example.practiceapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne: Fragment() {

    interface OnDataPassListener {
        fun onDataPass(data : String?)
    }

    lateinit var dataPassListener : OnDataPassListener

    override fun onAttach(context: Context) {
        Log.d("life_cycle", "onAttach")
        super.onAttach(context)
        dataPassListener = context as OnDataPassListener // 형변환
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("life_cycle", "onCreateView")
//        fragment 가 인터페이스를 처음으로 그릴 때 호출된다.
//        inflater : 뷰를 그리는 역할
//        container : 부모 뷰
        // inflate 메서드는 View 객체를 반환하여 화면을 그린다. -> 바로 return
        return inflater.inflate(R.layout.fragment_one, container, false)
        //return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle", "onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        // Activity 의 OnCreate 에서 했던 작업을 여기서 한다.
        pass.setOnClickListener {
            // Fragment 내의 버튼을 탭했을 때, 현재 실행중인 Activity 에 해당 string 을 보낸다.
            dataPassListener.onDataPass("Good Bye")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle", "onActivityCreated")

        val data = arguments?.getString("hello")
        if (!data.equals(null))
            data?.let { Log.d("data", it) }

        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("life_cycle", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("life_cycle", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("life_cycle", "onDetach")
        super.onDetach()
    }
}