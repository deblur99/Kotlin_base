package com.example.practiceapp.Tools;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class BackPressCloseHandler {
    private long backKeyClickTime = 0;
    private boolean isSecondPressed;

    private Activity activity;

    public BackPressCloseHandler(Activity activity) {
        this.activity = activity;
        isSecondPressed = false;
    }

    public void onBackPressed() {
        if (isSecondPressed) {
            isSecondPressed = false;
            activity.finish();
        }

        if (System.currentTimeMillis() > backKeyClickTime + 2000) {
            backKeyClickTime = System.currentTimeMillis();
            isSecondPressed = true;
            showToast();
        } else {
            backKeyClickTime = 0;
            isSecondPressed = false;
        }

        Log.d("isSecondPressed", "isSecondPressed: "+isSecondPressed);
    }

    public void showToast() {
        Toast.makeText(activity, "뒤로 가기 버튼을 한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
    }
}
