package com.example.learningtask42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Normal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        final TextView textViewToChange = (TextView) findViewById(R.id.normalvalue);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("normal");
            //The key argument here must match that used in the other activity
            textViewToChange.setText(value);
        }
    }
}
