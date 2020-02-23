package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class relative_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }

    public void nextScreen(View view)
    {
        Intent myIntent = new Intent(getBaseContext(), linear_layout.class);
        startActivity(myIntent);
    }

    public void previousScreen(View view)
    {
        Intent myIntent = new Intent(getBaseContext(), frame_layout.class);
        startActivity(myIntent);
    }

}
