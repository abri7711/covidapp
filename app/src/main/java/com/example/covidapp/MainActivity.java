package com.example.covidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton mapButton;
    ImageButton profileButton;
    ImageButton settingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapButton = (ImageButton) findViewById(R.id.mapIcon);
        profileButton = (ImageButton) findViewById(R.id.profile_icon);
        settingButton = (ImageButton) findViewById(R.id.settings);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intentLoadMapActivity = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intentLoadMapActivity);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intentLoadProfileActivity = new Intent(MainActivity.this, DataActivity.class);
                startActivity(intentLoadProfileActivity);
            }
        });

        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intentLoadSettingsActivity = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intentLoadSettingsActivity);
            }
        });
    }
}
