package com.example.zayac;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FrameActivity extends AppCompatActivity {
    private ImageView animationIV;
    private Button startBtn;
    private Button pauseBtn;
    private Button backBtn;
    private AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationIV = findViewById(R.id.animImageView);
        startBtn = findViewById(R.id.startButton);
        pauseBtn = findViewById(R.id.pauseButton);
        backBtn = findViewById(R.id.backBtn);

        Animation fallAnimation = AnimationUtils.loadAnimation(this, R.anim.falling_animation);

        startBtn.startAnimation(fallAnimation);
        pauseBtn.startAnimation(fallAnimation);
        backBtn.startAnimation(fallAnimation);
        animationIV.startAnimation(fallAnimation);

        frameAnimation = (AnimationDrawable) animationIV.getDrawable();

        startBtn.setOnClickListener(v -> {
            if (!frameAnimation.isRunning()) {
                frameAnimation.start();
            }
        });

        pauseBtn.setOnClickListener(v -> {
            if (frameAnimation.isRunning()) {
                frameAnimation.stop();
            }
        });

        backBtn.setOnClickListener(view -> {
            Intent intent = new Intent(FrameActivity.this, StartPage.class);
            startActivity(intent);
        });
    }
}
