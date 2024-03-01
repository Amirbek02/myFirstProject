package com.example.ourfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ourfirstproject.R;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText surName, name, lastName, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View texts = findViewById(R.id.tv_text);
        btn = findViewById(R.id.btn);
        surName= findViewById(R.id.surname);
        name = findViewById(R.id.name);
        lastName = findViewById(R.id.lastName);
        age = findViewById(R.id.age);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sur = surName.getText().toString();
                String names = name.getText().toString();
                String ages = age.getText().toString();
                String last = lastName.getText().toString();
                Log.d("Amirbek", sur);
                Intent intent = new Intent(MainActivity.this, com.example.ourfirstproject.SecondActivity.class);
                intent.putExtra("s", sur);
                intent.putExtra("n", names);
                intent.putExtra("a", ages);
                intent.putExtra("l", last);

                startActivity(intent);
            }
        });
    }
}