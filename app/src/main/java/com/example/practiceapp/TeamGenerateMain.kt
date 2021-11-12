package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_team_generate_main.*
import kotlinx.android.synthetic.main.activity_team_manager.*
import com.example.practiceapp.Tools.BackPressCloseHandler

class TeamGenerateMain : AppCompatActivity() {
    private val backPressCloseHandler = BackPressCloseHandler(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_generate_main)

        // 팀 생성 -> 팀 관리
        nav_team_manager.setOnClickListener {
            val intent = Intent(this@TeamGenerateMain, TeamManager::class.java)
            startActivity(intent)
            finish()
        }

        // 팀 생성 -> 팀 만들기
        create_btn.setOnClickListener {
            val intent = Intent(this@TeamGenerateMain, TeamCreation::class.java)
            startActivity(intent)
        }

        // 팀 생성 -> 팀 참여하기
        join_btn.setOnClickListener {
            val intent = Intent(this@TeamGenerateMain, TeamSearchMain::class.java)
            startActivity(intent)
        }

        // 팀 생성 -> 가입 확인하기
        confirmed_btn.setOnClickListener {
            val intent = Intent(this@TeamGenerateMain, TeamConfirmation::class.java)
            startActivity(intent)
        }
    }

    // 뒤로가기 종료 확인
    override fun onBackPressed() {
        //super.onBackPressed();
        backPressCloseHandler.onBackPressed();
    }
}