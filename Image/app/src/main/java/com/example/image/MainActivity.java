package com.example.image;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img1, img2, img3, imgp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        imgp = findViewById(R.id.imgprincipale);
        img1.setOnClickListener(v -> {
            imgp.setImageResource(R.drawable.img3);
        });
        img2.setOnClickListener(v -> {
            imgp.setImageResource(R.drawable.img2);
        });
        img3.setOnClickListener(v -> {
            imgp.setImageResource(R.drawable.img1);
        });

    }

}