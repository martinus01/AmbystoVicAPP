package com.example.ambystovicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VicMainActivity extends AppCompatActivity {

    private ImageButton bouton;
    private ImageButton boutonDevice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bouton = (ImageButton) findViewById(R.id.ButonTest);
        bouton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                    Intent intent= new Intent(getApplicationContext(), Activity_test.class);
                    startActivity(intent);
                    finish();
            }
        });

        boutonDevice = (ImageButton) findViewById(R.id.Button_device);
        boutonDevice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(), Activity_Device_Selection.class);
                startActivity(intent);
                finish();
            }
        });



    }
}