package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    public void backHome(View view) {
        //button for back to Home Page
        Intent intent = new Intent(Activity_about.this, MainActivity.class);
        startActivity(intent);
    }
}