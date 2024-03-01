package com.example.ourfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    Button btns;
    TextView surNames, names, lastNames, ages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btns = findViewById(R.id.btnT);
        surNames= findViewById(R.id.surnameT);
        names = findViewById(R.id.nameT);
        lastNames = findViewById(R.id.lastNameT);
        ages = findViewById(R.id.ageT);

        Intent getIntent = getIntent();
        String surNameT = getIntent.getStringExtra("s");
        String nameT = getIntent.getStringExtra("n");
        String lastNameT = getIntent.getStringExtra("l");
        String age = getIntent.getStringExtra("a");
        Log.d("Amirbek", surNameT);
        System.out.println(surNameT);
        surNames.setText(surNameT);
        names.setText(nameT);
        lastNames.setText(lastNameT);
        ages.setText(age);
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, com.example.ourfirstproject.MainActivity.class);
                startActivity(intent);
            }
        });

    }
}