package com.example.coursera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void milestokm(View view)
    {
        EditText milesText = (EditText) findViewById(R.id.miles);
        EditText kmText = (EditText) findViewById(R.id.km);
        // 1 mile = 1.60934 km
        double miles = Double.valueOf(milesText.getText().toString());
        double km = miles * 1.60934;
        DecimalFormat formatVal = new DecimalFormat("##.##");
        kmText.setText(formatVal.format(km));
    }
    public void kmtomiles(View view)
    {
        EditText kmText = (EditText) findViewById(R.id.km);
        EditText milesText = (EditText) findViewById(R.id.miles);
        double km = Double.valueOf(kmText.getText().toString());
        double miles = km/1.60934;
        DecimalFormat formatVal = new DecimalFormat("##.##");
        milesText.setText(formatVal.format(miles));
    }
}