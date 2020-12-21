package com.example.ktralan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,Trangchu.class));
            }
        },2500);
    }
}