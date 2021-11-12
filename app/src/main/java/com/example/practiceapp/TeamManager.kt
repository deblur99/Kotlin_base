package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceapp.Tools.BackPressCloseHandler
import kotlinx.android.synthetic.main.activity_team_manager.*

class TeamManager : AppCompatActivity() {
    private val backPressCloseHandler = BackPressCloseHandler(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_manager)

        // 팀 관리 -> 팀 생성
        nav_team_creation.setOnClickListener {
            val intent = Intent(this@TeamManager, TeamGenerateMain::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed();
        backPressCloseHandler.onBackPressed();
    }
}