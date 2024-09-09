package com.example.spleshscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity
{
    SessionManager sessionManager;
    EditText reg_name, reg_number, reg_email,reg_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        //------------register id assign------------>>
        reg_name = (EditText) findViewById(R.id.reg_name);
        reg_number = (EditText) findViewById(R.id.reg_number);
        reg_email = (EditText) findViewById(R.id.reg_email);
        reg_password = (EditText) findViewById(R.id.reg_password);
        sessionManager = new SessionManager(getApplicationContext());
    }

    public void registerNow(View view)
    {
        String name = reg_name.getText().toString();
        String number = reg_number.getText().toString();
        String email = reg_email.getText().toString();
        String password = reg_password.getText().toString();

        //---insert into mysql database------------------->>
        sessionManager.createSession(name, email,number);
        Intent intent = new Intent(this,Profile.class);
        startActivity(intent);

    }
    public void registerClick(View view)
    {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}