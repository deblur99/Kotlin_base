package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceapp.R
import kotlinx.android.synthetic.main.activity_team_creation.*

class TeamCreation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_creation)

        // Appbar 의 좌측 화살표 터치하면 팀 생성을 취소하고 메인 화면으로 나감
        // (TO DO) 입력값이 남아 있으면 취소 여부 창 띄우고, 확인을 누르면 모든 내용을 지우고 나감
        appbar1.setOnClickListener {
            val intent = Intent(this@TeamCreation, TeamGenerateMain::class.java)
            startActivity(intent);
            finish()
        }
    }
}