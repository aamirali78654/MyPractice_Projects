package com.example.spleshscreen;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profile extends AppCompatActivity
{
    TextView profile_text;
    SessionManager sessionManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        sessionManager = new SessionManager(getApplicationContext());
        profile_text = (TextView) findViewById(R.id.profile_text);
        String nameee = sessionManager.getSession("key_session_name");
        profile_text.setText(nameee);

    }
    public void profileLogOut(View view)
    {
        sessionManager.logoutSession();
    }
}