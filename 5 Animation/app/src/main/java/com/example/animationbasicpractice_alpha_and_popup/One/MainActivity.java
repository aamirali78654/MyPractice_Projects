package com.example.animationbasicpractice_alpha_and_popup.One;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.animationbasicpractice_alpha_and_popup.R;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //------------------------------------------>>
        imageView = findViewById(R.id.imageView);
        Animation ani = AnimationUtils.loadAnimation(this,R.anim.fadeout);
        imageView.startAnimation(ani);

        //-----------------Handler---------------->>
        //below code is for permenant fadeout---------->>
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView.setVisibility(View.GONE);
            }
        },4000);

    }
}