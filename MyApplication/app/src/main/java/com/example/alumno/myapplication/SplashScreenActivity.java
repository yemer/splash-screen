package com.example.alumno.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent o = new Intent(this, com.example.alumno.myapplication.LoginActiviti.class);
        startActivity(o);
        finish();
    }
}
