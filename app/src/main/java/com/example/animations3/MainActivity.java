package com.example.animations3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txt;
Button btnTranslate,btnRotation,btnScale,btnAlpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.text);
        btnTranslate=findViewById(R.id.translate);
        btnAlpha = findViewById(R.id.alpha);
        btnRotation = findViewById(R.id.rotation);
        btnScale = findViewById(R.id.scale);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animationTranslate = AnimationUtils
                        .loadAnimation(getApplicationContext(),
                                R.anim.translate_animation);
                txt.startAnimation(animationTranslate);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animationTranslate = AnimationUtils
                        .loadAnimation(getApplicationContext(),
                                R.anim.alpha_animation);
                txt.startAnimation(animationTranslate);
            }
        });
        btnRotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animationTranslate = AnimationUtils
                        .loadAnimation(getApplicationContext(),
                                R.anim.rotation_animation);
                txt.startAnimation(animationTranslate);
            }
        });
        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animationTranslate = AnimationUtils
                        .loadAnimation(getApplicationContext(),
                                R.anim.scale_animation);
                txt.startAnimation(animationTranslate);
            }
        });

    }
}