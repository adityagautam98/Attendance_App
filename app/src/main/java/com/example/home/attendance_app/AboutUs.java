package com.example.home.attendance_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        getSupportActionBar().setTitle("About Us");
    }
}