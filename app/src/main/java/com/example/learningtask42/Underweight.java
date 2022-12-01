package com.example.learningtask42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Underweight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_underweight);
        final TextView textViewToChange = (TextView) findViewById(R.id.underweightvalue);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("underweight");
            //The key argument here must match that used in the other activity
            textViewToChange.setText(value);
        }
    }
}