package com.example.ambystovicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_log  extends AppCompatActivity {


    private ImageButton boutonDevice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_log);

        boutonDevice = (ImageButton) findViewById(R.id.signin);
        boutonDevice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(), VicMainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
