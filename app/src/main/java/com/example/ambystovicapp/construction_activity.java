package com.example.ambystovicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class construction_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construction);
    }

        //code permettant l'utilisation de notre bouton
        public void onBackPressed() {
            Intent intent = new Intent(getApplicationContext(), Activity_Device_Selection.class);
            startActivity(intent);
            finish();
        }
}