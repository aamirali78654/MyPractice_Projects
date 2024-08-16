package com.example.myapplication7;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list_view;
    ArrayList arr_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        list_view = findViewById(R.id.list_view);
        arr_list = new ArrayList();
        //====================using ArrayList======================>>
        arr_list.add(new animals(R.drawable.cat,"cat"));
        arr_list.add(new animals(R.drawable.catc,"catc"));
        arr_list.add(new animals(R.drawable.dogs,"dogs"));
        arr_list.add(new animals(R.drawable.dolphin,"dolphin"));
        arr_list.add(new animals(R.drawable.hedgehog,"hedghog"));
        arr_list.add(new animals(R.drawable.pexels,"Fox"));
        arr_list.add(new animals(R.drawable.photo,"photo"));
        arr_list.add(new animals(R.drawable.tabbycat,"tabbyCat"));
        arr_list.add(new animals(R.drawable.cat,"cat"));
        arr_list.add(new animals(R.drawable.catc,"catc"));
        arr_list.add(new animals(R.drawable.dogs,"dogs"));
        arr_list.add(new animals(R.drawable.dolphin,"dolphin"));
        arr_list.add(new animals(R.drawable.hedgehog,"hedghog"));
        arr_list.add(new animals(R.drawable.pexels,"Fox"));
        arr_list.add(new animals(R.drawable.photo,"photo"));
        arr_list.add(new animals(R.drawable.tabbycat,"tabbyCat"));
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>>
        Array_Adapter arr_adapter = new Array_Adapter(MainActivity.this,R.layout.ui_array_adapter_threefile ,arr_list);
        list_view.setAdapter(arr_adapter);


    }
}