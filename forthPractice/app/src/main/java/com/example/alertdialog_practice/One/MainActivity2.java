package com.example.alertdialog_practice.One;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.alertdialog_practice.R;

public class MainActivity2 extends AppCompatActivity {
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        image = findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dia = new Dialog(MainActivity2.this);
                dia.setContentView(R.layout.ui_custom_alert);
                //==================Declair the Buttons id's==================>>
                Button buttoncan,buttonyes,buttonno;
                buttoncan = dia.findViewById(R.id.buttoncan);
                buttonno = dia.findViewById(R.id.buttonno);
                buttonyes = dia.findViewById(R.id.buttonyes);
                //===================Buttons ID modifies on Toast Clicked==============>>
                buttoncan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity2.this, "you Clicked Cancel!", Toast.LENGTH_SHORT).show();
                        dia.dismiss();
                    }
                });
                buttonno.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity2.this, "you Clicked No!", Toast.LENGTH_SHORT).show();
                        dia.dismiss();
                    }
                });
                buttonyes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity2.this, "you Clicked Yes!", Toast.LENGTH_SHORT).show();
                        dia.dismiss();
                    }
                });


                dia.setCancelable(false);
                dia.show();

            }
        });


    }
}