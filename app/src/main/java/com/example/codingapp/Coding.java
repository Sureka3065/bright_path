package com.example.codingapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Coding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding);
        CardView cpro = findViewById(R.id.c_programming_card);
        CardView cpppro = findViewById(R.id.cpp_programming_card);
        CardView pypro = findViewById(R.id.python_programming_card);
        CardView javapro = findViewById(R.id.java_programming_card);
        // Navigate to C Programming Screen
        cpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coding.this, Cprogram.class);
                startActivity(intent);
            }
        });

        // Navigate to C++ Programming Screen

        cpppro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coding.this, Cplus.class);
                startActivity(intent);
            }
        });

        // Navigate to Python Programming Screen
        pypro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coding.this, Python.class);
                startActivity(intent);
            }
        });

        // Navigate to Java Programming Screen
        javapro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coding.this, Java.class);
                startActivity(intent);

            }
        });
    }
}
