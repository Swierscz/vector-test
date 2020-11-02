package com.example.vector_test;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView view = findViewById(R.id.imageView);
        Animatable animatable = (Animatable) view.getDrawable();
        animatable.start();
    }
}