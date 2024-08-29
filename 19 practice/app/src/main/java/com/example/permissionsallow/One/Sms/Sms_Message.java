package com.example.permissionsallow.One.Sms;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
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

public class Sms_Message extends AppCompatActivity {
    EditText edit_text , edit_phone;
    private final int SMS_CODE_VERSION = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sms_message);
        edit_phone = (EditText) findViewById(R.id.edit_phone);
        edit_text = (EditText) findViewById(R.id.edit_text);

    }
    //======================Sms Code to run at time by many time override==============>>>
    void sms()
    {
        String num = edit_phone.getText().toString();
        String sms_m = edit_text.getText().toString();
        //==================Sms Code by Permissions ==============>>
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(num,null,sms_m,null,null);
    }
  //======================================================================================>>>
  //===================Button OnClick View===============================================>>>
    public void btn_click(View view)
    {
        if(ContextCompat.checkSelfPermission(Sms_Message.this , Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED)
        {
            sms();
        }
        else
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS} , SMS_CODE_VERSION);
        }

    }
    //===================================================================================>>>>
    //--------------------------------OnRequest Permissions Result auto Recall------------>>>>
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED && SMS_CODE_VERSION == 2)
        {
            sms();
        }
    }
}