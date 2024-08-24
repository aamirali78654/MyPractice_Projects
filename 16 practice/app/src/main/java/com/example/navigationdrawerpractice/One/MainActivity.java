package com.example.navigationdrawerpractice.One;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.navigationdrawerpractice.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
{
    Toolbar toolbar;
    DrawerLayout main_drawer_layout;
    NavigationView  navigation_view;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        main_drawer_layout = (DrawerLayout) findViewById(R.id.main_drawer_layout);
        navigation_view = (NavigationView) findViewById(R.id.navigation_view);

        //=============toggle details in this line================>>

        toggle = new ActionBarDrawerToggle(this,main_drawer_layout,toolbar,R.string.open,R.string.close);
        main_drawer_layout.addDrawerListener(toggle);
        toggle.syncState();

      //============Fragments usage in this line=============>>>

        navigation_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)

            {
                if(item.getItemId() == R.id.home)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_main, new home()).commit();
                    main_drawer_layout.closeDrawer(GravityCompat.START);
                }
               else if(item.getItemId() == R.id.message)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_main, new message()).commit();
                    main_drawer_layout.closeDrawer(GravityCompat.START);
                }
                else if(item.getItemId() == R.id.person)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_main, new profile()).commit();
                    main_drawer_layout.closeDrawer(GravityCompat.START);
                }
                else if(item.getItemId() == R.id.setting)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_main, new settings()).commit();
                    main_drawer_layout.closeDrawer(GravityCompat.START);
                }
                return true;
            }
        });

    }
}