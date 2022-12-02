package com.example.learningtask42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
            textViewToChange.setText(value);
        }
        Button btn = findViewById(R.id.backbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainactivity = new Intent(Normal.this, MainActivity.class);
                startActivity(mainactivity);
            }
        });
    }
}
