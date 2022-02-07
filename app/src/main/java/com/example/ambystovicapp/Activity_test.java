package com.example.ambystovicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Activity_test extends AppCompatActivity {
    private ImageButton bouton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_test);

                bouton = (ImageButton) findViewById(R.id.RetourMain);
                bouton.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent= new Intent(getApplicationContext(), VicMainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });





    }
}