package com.example.ambystovicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity_Device_Selection extends AppCompatActivity {

    private ImageButton bouton;
    private ImageButton bouton1;
    private ImageButton bouton2;
    private ImageButton bouton3;
    private ImageButton bouton4;
    private ImageButton bouton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_selection);


        bouton = (ImageButton) findViewById(R.id.button_carte_apple);
        bouton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(), Activity_music.class);
                startActivity(intent);
                finish();
            }
        });

        bouton = (ImageButton) findViewById(R.id.button_carte_casque);
        bouton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(), construction_activity.class);
                startActivity(intent);
                finish();
            }
        });




    }

    //code permettant l'utilisation de notre bouton
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), VicMainActivity.class);
        startActivity(intent);
        finish();
    }

}