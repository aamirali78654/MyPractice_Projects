package com.example.animationbasicpractice_alpha_and_popup.One.Two;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.animationbasicpractice_alpha_and_popup.R;

public class MainActivity extends AppCompatActivity {
    ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        img2 = findViewById(R.id.img2);

        //++++++++++++++++++Animation Scale and rotate both connect++++++++++++++++++
        Animation ani = AnimationUtils.loadAnimation(this,R.anim.blink);
        img2.startAnimation(ani);


    }
}