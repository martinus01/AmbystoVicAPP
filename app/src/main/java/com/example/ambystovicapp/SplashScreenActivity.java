package com.example.ambystovicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {


    private final int SPLASH_SCREEN_DELAY = 10000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        // rediriger ver la page main_activity après 1 secondes.
        Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent= new Intent(getApplicationContext(), Activity_log.class);
            startActivity(intent);
            finish();
        }
    };

    new Handler().postDelayed(runnable,SPLASH_SCREEN_DELAY);
    }

}