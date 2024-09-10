package com.example.spleshscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {
    EditText log_email,log_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);


    }
    //----------login Click event method------------->>>
    public void loginNow(View view)
    {
        log_email = (EditText) findViewById(R.id.log_email);
        log_password = (EditText) findViewById(R.id.log_password);
        String log_e = log_email.getText().toString();
        String log_p = log_password.getText().toString();
    //----------Register method include --------->>
        Register r = new Register();
        String email =  r.reg_email.getText().toString();
        String password = r.reg_password.getText().toString();

        if(log_e == email && log_p == password)
        {
            Intent intent = new Intent(getApplicationContext(), Profile.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "Please Registertion!!", Toast.LENGTH_SHORT).show();
        }

    }

    public void notRegester(View view)
    {
        Intent intent = new Intent(getApplicationContext(), Register.class);
        startActivity(intent);
    }
}