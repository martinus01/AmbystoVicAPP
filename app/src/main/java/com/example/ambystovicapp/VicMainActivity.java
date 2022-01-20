package com.example.ambystovicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class VicMainActivity extends AppCompatActivity {

    private ImageButton bouton;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);



        bouton = (ImageButton) findViewById(R.id.ButonTest);
        bouton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                    //i=i++;
                    //R.id.


                    Intent intent= new Intent(getApplicationContext(), Activity_test.class);
                    startActivity(intent);
                    finish();
            }
        });





        //tentative avec le temps
        /*
        bouton = (ImageButton) findViewById(R.id.ButonTest);
        bouton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(getApplicationContext(), Activity_test.class);
                startActivity(intent);
                finish();
            }
        },20000);
            }
        });*/
    }
}