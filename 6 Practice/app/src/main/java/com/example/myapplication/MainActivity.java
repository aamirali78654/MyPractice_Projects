package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.One.OneBaseAdapter;

public class MainActivity extends AppCompatActivity {
    ListView list_view;
    String[] str = {"Car","Catc","Dogs","Dogs","Dolphin","Ducklens","Hedgehog","Fox","TabbyCat","Car","Catc","Dogs","Dogs","Dolphin","Ducklens","Hedgehog","Fox","TabbyCat","Car","Catc","Dogs","Dogs","Dolphin","Ducklens","Hedgehog","Fox","TabbyCat"};
    int[] image_arr ={R.drawable.cat,R.drawable.catc,R.drawable.dogs,R.drawable.dogs,R.drawable.dolphin,
            R.drawable.ducklens,R.drawable.hedgehog,R.drawable.pexels,R.drawable.tabbycat,R.drawable.cat,R.drawable.catc,R.drawable.dogs,R.drawable.dogs,R.drawable.dolphin,
            R.drawable.ducklens,R.drawable.hedgehog,R.drawable.pexels,R.drawable.tabbycat,R.drawable.cat,R.drawable.catc,R.drawable.dogs,R.drawable.dogs,R.drawable.dolphin,
                      R.drawable.ducklens,R.drawable.hedgehog,R.drawable.pexels,R.drawable.tabbycat};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        list_view = findViewById(R.id.list_view);
//=====================BaseAdapter Class's objects=============>>
        OneBaseAdapter One = new OneBaseAdapter(MainActivity.this , str , image_arr);
        list_view.setAdapter(One);


    }
}