package com.example.practiceapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_practice.*

class Intent_Practice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_practice)

        confirm_button.setOnClickListener {
            var inputURL : String = input_form.text.toString()

            if (!inputURL.contains("http://") || !inputURL.contains("https://")) {
                inputURL = "https://$inputURL"
            }

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(inputURL))

            startActivity(intent)
        }
    }
}