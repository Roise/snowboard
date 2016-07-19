package com.roi.snow;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IntroActivity extends AppCompatActivity {
    private Handler mTimer = null;
    private boolean mIsTimerOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        mTimer = new Handler();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(mTimer != null) {
            mIsTimerOn = true;
            mTimer.postDelayed(new Runnable() {
                @Override
                public void run() {
                  try {
                      if(mIsTimerOn) {
                          // 메인 이동
                          Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                          intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                          startActivity(intent);
//                          overridePendingTransition(R.anim.hold,);
                      }
                      finish();
                  }catch (Exception e) {
                      e.printStackTrace();
                  }
                }
            }, 500);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        mIsTimerOn = false;
        mTimer = null;

        finish();
    }
}
