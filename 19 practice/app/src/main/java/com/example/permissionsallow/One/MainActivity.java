package com.example.permissionsallow.One;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.permissionsallow.R;

public class MainActivity extends AppCompatActivity {
    EditText edit_text;
    private final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edit_text = (EditText) findViewById(R.id.edit_text);
    }
    public void BtnClick(View view)
    {

        if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED)
        {
         call();
        }
        else
        {
            ActivityCompat.requestPermissions(MainActivity.this ,new String[]{Manifest.permission.CALL_PHONE} , REQUEST_CODE);
        }
    }

    void call()
    {
        String phone = edit_text.getText().toString();

//       // ==============Permission not required===========>>
//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:"+phone));
//        startActivity(intent);
//
        //=====++====permission required==================>>>
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+phone));
        startActivity(intent);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults.length>0 &&  grantResults[0] == PackageManager.PERMISSION_GRANTED && REQUEST_CODE == 1)
        {
            call();
        }
    }
}