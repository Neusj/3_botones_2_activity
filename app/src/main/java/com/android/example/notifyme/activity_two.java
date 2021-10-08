package com.android.example.notifyme;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class activity_two extends AppCompatActivity {


    private TextView timerTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

     //   timerTextView = findViewById(R.id.timer);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(activity_two.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
/*

        final long startTime = 0;

        //runs without a timer by reposting this handler at the end of the runnable
        final Handler timerHandler = new Handler();
        Runnable timerRunnable = new Runnable() {

            @Override
            public void run() {
                long millis = System.currentTimeMillis() - startTime;
                int seconds = (int) (millis / 1000);
                int minutes = seconds / 60;
                seconds = seconds % 60;

                timerTextView.setText(String.format("%d:%02d", minutes, seconds));

                timerHandler.postDelayed(this, 500);
            }
        };
*/

    }
}