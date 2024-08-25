package com.example.glide_and_picasso.One;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.glide_and_picasso.R;

public class MainActivityGlide extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_glide);
        imageView = (ImageView) findViewById(R.id.imageView);

    }
    public void clickNow(View view)
    {
        String url = "https://cdn.pixabay.com/photo/2024/05/26/10/15/bird-8788491_1280.jpg";


    }
}