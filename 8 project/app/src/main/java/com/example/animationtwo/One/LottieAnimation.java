package com.example.animationtwo.One;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.animationtwo.R;

public class LottieAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lottie_animation);

        //-----------------------------------------------------

        LottieAnimationView animationView = findViewById(R.id.lottie_animation_view);

// Play animation
        animationView.playAnimation();

// Pause animation
        animationView.pauseAnimation();

// Stop animation
        animationView.cancelAnimation();


    }
}