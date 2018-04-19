package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_details);

        Intent myIntent = getIntent();
        Bundle extras = myIntent.getExtras();
        String name = extras.getString("NAME");
        String location = extras.getString("LOCATION");
        String height = extras.getString("HEIGHT");

        TextView textName = (TextView)findViewById(R.id.textName);
        textName.setText(name);

        TextView textLocation = (TextView)findViewById(R.id.textLocation);
        textLocation.setText(location);

        TextView textHeight = (TextView)findViewById(R.id.textHeight);
        textHeight.setText(height);
    }
}
