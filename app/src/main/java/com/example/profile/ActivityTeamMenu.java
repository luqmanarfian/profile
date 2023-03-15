package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityTeamMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_menu);
    }

    public void backHome(View view) {
            //button for back to Home Page
            Intent intent = new Intent(ActivityTeamMenu.this, MainActivity.class);
            startActivity(intent);
    }
}