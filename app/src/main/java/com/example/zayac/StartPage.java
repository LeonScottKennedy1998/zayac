package com.example.zayac;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartPage extends AppCompatActivity {
    private Button FrameBtn;
    private Button TweenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceStart) {
        super.onCreate(savedInstanceStart);
        setContentView(R.layout.start_page);
        FrameBtn = findViewById(R.id.framebutton);
        TweenBtn = findViewById(R.id.tweenbutton);

        Animation buttonAnimation = AnimationUtils.loadAnimation(this, R.anim.button_animation);

        TweenBtn.startAnimation(buttonAnimation);
        FrameBtn.startAnimation(buttonAnimation);

        FrameBtn.setOnClickListener(view -> {
            Intent intent = new Intent(StartPage.this, FrameActivity.class);
            startActivity(intent);

        });

        TweenBtn.setOnClickListener(view -> {
            Intent intent = new Intent(StartPage.this, TweenActivity.class);
            startActivity(intent);
        });

    }

}
