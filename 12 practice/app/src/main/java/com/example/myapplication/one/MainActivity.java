package com.example.myapplication.one;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
      ViewPager2 view_pager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        view_pager2 = findViewById(R.id.view_pager2);

     MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(), getLifecycle());
     view_pager2.setAdapter(myAdapter);
    }
}