package com.example.mybottomnevigation.One;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mybottomnevigation.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btm_vavy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btm_vavy = findViewById(R.id.btm_vavy);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout , new Home()).commit();

        btm_vavy.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                if(item.getItemId() == R.id.home)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout , new Home()).commit();
                }
                else if(item.getItemId() == R.id.profile)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout , new Profile()).commit();
                }
                else if(item.getItemId() == R.id.message)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout , new Settings()).commit();
                }
                else if(item.getItemId() == R.id.setting)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout , new Message()).commit();
                }
                return true;
            }
        });
    }
    //========== floating action button===============>>>
    public void floatingbtn(View view)
    {
        Toast.makeText(this, "you clicked FLoating Button!!", Toast.LENGTH_SHORT).show();
    }
}