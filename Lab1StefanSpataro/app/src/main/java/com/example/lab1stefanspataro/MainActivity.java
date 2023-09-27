package com.example.lab1stefanspataro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int[] myImages = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4};
    private int imageNum = 0;


    private ImageView imageView;
    private Button btnNext;
    private Button btnPrevious;
    private Button btnRandom;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //imageView
        imageView = findViewById(R.id.imageView);

        //buttons
        btnNext = findViewById(R.id.btnNext);
        btnPrevious = findViewById(R.id.btnPrev);
        btnRandom = findViewById(R.id.btnRan);

        //textView
        textView = findViewById(R.id.textView2);

        //button listeners
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageNum++;
                imageView.setImageResource(myImages[imageNum]);
            }
        });
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageNum--;
                imageView.setImageResource(myImages[imageNum]);
            }
        });
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}