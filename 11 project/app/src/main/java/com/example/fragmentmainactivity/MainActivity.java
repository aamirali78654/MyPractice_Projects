package com.example.fragmentmainactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragmentmainactivity.One.FragmentOne;
import com.example.fragmentmainactivity.One.FragmentTwo;

public class MainActivity extends AppCompatActivity {
    Button btn_login,btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
  //-------------------fragment layout call in coding part MainActivity-------------->>>
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_main, new FragmentOne());
        fragmentTransaction.commit();
        //=====================button id declair=================>>
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);
        //--------------login button setOnClickListener------------->>>>>>>>
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_main,new FragmentOne());
                fragmentTransaction.commit();
            }
        });
        //-----------------register button setOnClickListener----------->>>>>
       btn_register.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               FragmentManager fragmentManager = getSupportFragmentManager();
               FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
               fragmentTransaction.replace(R.id.fragment_main, new FragmentTwo());
               fragmentTransaction.commit();
           }
       });

    }
}