package com.example.learningtask42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Overweight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overweight);
        final TextView textViewToChange = (TextView) findViewById(R.id.overweightvalue);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("overweight");

            textViewToChange.setText(value);
        }
    }
}