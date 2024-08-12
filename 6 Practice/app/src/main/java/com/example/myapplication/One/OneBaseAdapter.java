package com.example.myapplication.One;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.R;


public class OneBaseAdapter extends BaseAdapter

    {
        Context context;
        String[] text;
        int[] img;
        LayoutInflater lf ;

       public OneBaseAdapter(Context context , String[] text,int[] img)
        {
            this.text = text;
            this.img = img;
            this.context = context;
             lf = LayoutInflater.from(context);

        }

        @Override
        public int getCount() {
            return text.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
           View v = lf.inflate(R.layout.ui_adapter_xml,null);

            TextView text_view = v.findViewById(R.id.text_view);
            ImageView image_view = v.findViewById(R.id.image_view);

            image_view.setImageResource(img[i]);
           text_view.setText(text[i]);

           return v;
        }
    }
