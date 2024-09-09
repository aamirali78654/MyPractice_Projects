package com.example.spleshscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                SessionManager sessionManager = new SessionManager(getApplicationContext());
                boolean b = sessionManager.checkSession();
                if(b == true)
                {
                    Intent intent = new Intent(getApplicationContext() , Profile.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(getApplicationContext() , Login.class);
                    startActivity(intent);
                }
            }
        },2000);
    }
}