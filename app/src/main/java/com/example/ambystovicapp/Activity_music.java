package com.example.ambystovicapp;

import android.os.Bundle;
import android.view.WindowManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_music extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_music);


    }
    //code permettant l'utilisation de notre bouton
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), Activity_Device_Selection.class);
        startActivity(intent);
        finish();
    }

}
