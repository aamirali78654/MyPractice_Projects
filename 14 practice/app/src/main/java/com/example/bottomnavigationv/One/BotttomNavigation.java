package com.example.bottomnavigationv.One;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BotttomNavigation extends AppCompatActivity {
    BottomNavigationView bottom_navigation;
    FrameLayout frame_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_botttom_navigation);

        bottom_navigation = findViewById(R.id.btm_nav);
        frame_layout =  findViewById(R.id.frame_layout);

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new FragmentOne()).commit();
                        break;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new FragmentTwo()).commit();
                        break;
                    case R.id.message:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new FragmentThree()).commit();
                        break;
                    case R.id.settings:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new FragmentFour()).commit();
                        break;

                }
                return true;
            }
        });

    }
}