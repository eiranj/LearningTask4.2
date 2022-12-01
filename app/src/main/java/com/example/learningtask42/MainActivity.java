package com.example.learningtask42;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    EditText edKg,edFeet,edInc;
    CardView calcu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edFeet = findViewById(R.id.edFeet);
        edKg = findViewById(R.id.edKg);
        edInc = findViewById(R.id.edInc);
        calcu = findViewById(R.id.calcu);
        ClickListener();
    }

public void ClickListener(){
        calcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String kg = edKg.getText().toString();
                String feet = edFeet.getText().toString();
                String inc = edInc.getText().toString();


                float weight = Float.parseFloat(kg);
                float efeet = Float.parseFloat(feet);
                float eInc = Float.parseFloat(inc);


                float height = (float) (((eInc*1/12)+efeet)/3.28084);
                float bmiIndex = weight / (height * height);

                switch ( bmichecker(bmiIndex)) {
                    case 1: {
                        String bmi = String.valueOf(bmiIndex);
                        Intent overweight = new Intent(MainActivity.this, Overweight.class);
                        overweight.putExtra("overweight", bmi);
                        startActivity(overweight);
                        break;
                    }
                    case 2: {
                        String bmi = String.valueOf(bmiIndex);
                        Intent normal = new Intent(MainActivity.this, Normal.class);
                        normal.putExtra("normal", bmi);
                        startActivity(normal);
                        break;
                    }
                    case 3: {
                        String bmi = String.valueOf(bmiIndex);
                        Intent underweight = new Intent(MainActivity.this, Underweight.class);
                        underweight.putExtra("underweight", bmi);
                        startActivity(underweight);
                        break;
                    }

                }
            }

                public int bmichecker (float bmiIndex){
                    if (bmiIndex >= 24) {
                        return 1;
                    } else if (bmiIndex >= 18) {
                        return 2;
                    } else {
                        return 3;
                    }
                }

        });

    }
}