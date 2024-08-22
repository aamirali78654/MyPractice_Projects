package com.example.myapplication.frag.fOnedetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.myapplication.R;
import java.util.ArrayList;

public class MyAdapterA extends ArrayAdapter

      {
          Context context;
          ArrayList al;
          LayoutInflater lf ;
          public MyAdapterA(@NonNull Context context, int resource, @NonNull ArrayList objects)
          {
              super(context, resource, objects);
              this.context = context;
              this.al = objects;
              lf = LayoutInflater.from(context);
          }

          @Override
          public int getCount()
          {
              return al.size();
          }

          @NonNull
          @Override
          public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
          {
              ImageView image_view;
              TextView text_view;

              Animals an = (Animals) al.get(position);
              View v = lf.inflate(R.layout.image_text_fragment_one, null);
              image_view = v.findViewById(R.id.profile_image);
              text_view = v.findViewById(R.id.text_view);
              image_view.setImageResource(an.getimg());
              text_view.setText(an.getname());

              return v;
          }
      }
