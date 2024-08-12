package com.example.myapplication7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Array_Adapter extends ArrayAdapter<animals>
   {
       ArrayList<animals> animal_Arr;
       LayoutInflater lf;

    public Array_Adapter( Context context, int resource, ArrayList<animals> objects)
    {
        super(context, resource, objects);
        this.animal_Arr = objects;
        lf = LayoutInflater.from(context);

    }

       @Override
       public int getCount() {
           return animal_Arr.size();
       }

       @NonNull
       @Override
       public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = lf.inflate(R.layout.ui_array_adapter_threefile, null);

           TextView textView = v.findViewById(R.id.textView);
           ImageView imageView =  v.findViewById(R.id.imageView);

           imageView.setImageResource(animal_Arr.get(position).getimg());
           textView.setText(animal_Arr.get(position).getname());

        return v;
       }
   }
