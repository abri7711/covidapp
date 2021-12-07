package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView linkTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        linkTextView = findViewById(R.id.getTheData);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}