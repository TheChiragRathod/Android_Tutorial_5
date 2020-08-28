package com.rku.tutorial5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Timer timer =new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                Intent intent =new Intent(Splash.this,Registration.class);
                startActivity(intent);
                finish();
            }
        };

        timer.schedule(timerTask,2000);

    }
}