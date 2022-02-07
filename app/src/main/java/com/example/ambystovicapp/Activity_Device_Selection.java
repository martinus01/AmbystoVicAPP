package com.example.ambystovicapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_Device_Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_selection);
    }

    //code permettant l'utilisation de notre bouton
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), VicMainActivity.class);
        startActivity(intent);
        finish();
    }
}