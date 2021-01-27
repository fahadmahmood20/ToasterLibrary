package com.biocheck.toaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.biocheck.library.Calculations;

public class MainActivity extends AppCompatActivity {
    Calculations calculations = new Calculations();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "check it out = " + calculations.getHeartRate(5, 2), Toast.LENGTH_SHORT).show();
        TextView textView = findViewById(R.id.text);
        textView.setText("check it out 5 + 2  = " + calculations.getHeartRate(5, 2));
    }
}