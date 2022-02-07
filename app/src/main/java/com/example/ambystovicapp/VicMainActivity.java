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

    private ImageButton boutonDevice;
    //private int i=0;
    private ImageButton bouton5;
    private ImageButton bouton6;
    private ImageButton bouton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

    /*
    //vers la page de test
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
        });*/

        boutonDevice = (ImageButton) findViewById(R.id.Button_device);
        boutonDevice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(), Activity_Device_Selection.class);
                startActivity(intent);
                finish();
            }
        });
/*
        bouton5 = (ImageButton) findViewById(R.id.button_carte_rfid);
        bouton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(), construction_activity.class);
                startActivity(intent);
                finish();
            }
        });

        bouton6 = (ImageButton) findViewById(R.id.Button_roue);
        bouton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(), construction_activity.class);
                startActivity(intent);
                finish();
            }
        });

        bouton7 = (ImageButton) findViewById(R.id.Button_Jacket);
        bouton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(), construction_activity.class);
                startActivity(intent);
                finish();
            }
        });



*/


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