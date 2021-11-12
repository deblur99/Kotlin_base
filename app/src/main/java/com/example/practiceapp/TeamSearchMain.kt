package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_team_creation.*
import kotlinx.android.synthetic.main.activity_team_creation.appbar1
import kotlinx.android.synthetic.main.activity_team_manager.*
import kotlinx.android.synthetic.main.activity_team_search_main.*

class TeamSearchMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_search_main)

        // Appbar 의 좌측 화살표 터치하면 팀 생성을 취소하고 메인 화면으로 나감
        appbar1.setOnClickListener {
            val intent = Intent(this@TeamSearchMain, TeamGenerateMain::class.java)
            startActivity(intent)
            finish()
        }

        // 현재 개설된 팀 목록 키워드로 입력 받아 검색
        team_search_button.setOnClickListener {
            val searchKeyword = team_search_bar.text.toString()
            // TODO: 입력 결과 데이터베이스에서 query
        }
    }
}