package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecycler extends RecyclerView.Adapter<MyRecycler.MyRecyclerView>
{
    int[] arr_imgR;
    String[] arr_nameR;

    public MyRecycler(int[] i, String[] n)
    {
     this.arr_imgR = i;
     this.arr_nameR = n;
    }
    @NonNull
    @Override
    public MyRecyclerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater lf = LayoutInflater.from(parent.getContext());
        View v = lf.inflate(R.layout.inflate_view_myholder,parent,false);
        return new MyRecyclerView(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerView holder, int position)
    {
        holder.imageView.setImageResource(arr_imgR[position]);
        holder.textView.setText(arr_nameR[position]);

    }

    @Override
    public int getItemCount() {
        return arr_imgR.length;
    }
//============create RecyclerView Class by View_Holder=========>>>
    class MyRecyclerView extends RecyclerView.ViewHolder
    {
        private ImageView imageView;
        private TextView textView;

        public MyRecyclerView(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_View);
            textView = itemView.findViewById(R.id.text_View);

        }
    }
}
