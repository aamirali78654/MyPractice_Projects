package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView result_tv , solution_tv;
    MaterialButton btn_c , btn_obrack , btn_cbrack;
    MaterialButton btn_divide , btn_multiple , btn_plus , btn_minus , btn_equal;
    MaterialButton btn_0 , btn_1,btn_2 , btn_3,btn_4 , btn_5,btn_6 , btn_7,btn_8 , btn_9;
    MaterialButton btn_ac , btn_dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        result_tv = (TextView) findViewById(R.id.result_tv);
        solution_tv = (TextView) findViewById(R.id.solution_tv);
        //==============Material Button id============>>
        assignId(btn_c , R.id.btn_c);

    }
    //==========AssignId Material Button==============>>>
    void assignId(MaterialButton btn ,int id) {
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}