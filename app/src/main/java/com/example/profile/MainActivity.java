package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahMenu1(View view) {
        Intent  intent = new Intent(MainActivity.this, Activity_menu1.class);
        startActivity(intent);
    }

    public void pindahTeamMenu(View view) {
            Intent  intent = new Intent(MainActivity.this, ActivityTeamMenu.class);
            startActivity(intent);
    }
}