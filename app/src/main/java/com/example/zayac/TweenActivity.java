package com.example.zayac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TweenActivity extends AppCompatActivity {
    private ImageView img;
    private Button start_button;
    private Button pause_button;
    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceStart) {
        super.onCreate(savedInstanceStart);

        setContentView(R.layout.second_animation);
        img = findViewById(R.id.imgBlink);
        start_button = findViewById(R.id.startTween);
        pause_button = findViewById(R.id.pauseTween);
        backBtn = findViewById(R.id.backBtn);


        Animation blinkAnimation = AnimationUtils.loadAnimation(this,R.anim.blink_animation);
        Animation risingAnimation = AnimationUtils.loadAnimation(this, R.anim.rising_animation);


        start_button.startAnimation(risingAnimation);
        pause_button.startAnimation(risingAnimation);
        backBtn.startAnimation(risingAnimation);
        img.startAnimation(risingAnimation);


        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {img.startAnimation(blinkAnimation);

            }
        });

        pause_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {img.clearAnimation();

            }
        });

        backBtn.setOnClickListener(view -> {
            Intent intent = new Intent(TweenActivity.this, StartPage.class);
            startActivity(intent);
        });
    }
}
