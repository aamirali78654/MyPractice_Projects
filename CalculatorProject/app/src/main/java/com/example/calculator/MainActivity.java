package com.example.calculator;

import android.content.Context;
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

        //==============Material Button assign id's============>>
        assignId(btn_c , R.id.btn_c);
        assignId(btn_ac , R.id.btn_ac);
        assignId(btn_obrack , R.id.btn_o_bracket);
        assignId(btn_cbrack , R.id.btn_c_bracket);
        assignId(btn_divide , R.id.btn_divide);
        assignId(btn_multiple , R.id.btn_multiply);
        assignId(btn_plus , R.id.btn_plus);
        assignId(btn_minus , R.id.btn_minus);
        assignId(btn_equal , R.id.btn_equal);
        assignId(btn_dot , R.id.btn_dot);
        assignId(btn_0 , R.id.btn_0);
        assignId(btn_1 , R.id.btn_1);
        assignId(btn_2 , R.id.btn_2);
        assignId(btn_3 , R.id.btn_3);
        assignId(btn_4 , R.id.btn_4);
        assignId(btn_5 , R.id.btn_5);
        assignId(btn_6 , R.id.btn_6);
        assignId(btn_7 , R.id.btn_7);
        assignId(btn_8 , R.id.btn_8);
        assignId(btn_9 , R.id.btn_9);

    }
    //==========AssignId Material Button==============>>>
    void assignId(MaterialButton btn ,int id) {
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = solution_tv.getText().toString();

        if(buttonText.equals("AC"))
        {
            solution_tv.setText("");
            result_tv.setText("0");
            return;
        }
        if(buttonText.equals("="))
        {
            solution_tv.setText(result_tv.getText());
            return;
        }
        if(buttonText.equals("C"))
        {
            dataToCalculate = dataToCalculate.substring(0,dataToCalculate.length()-1);
            return;
        }else{
            dataToCalculate = dataToCalculate+buttonText;
        }
            solution_tv.setText(dataToCalculate);
    }
    String getResult(String data)
    {
        return "Calculator";
    }
}