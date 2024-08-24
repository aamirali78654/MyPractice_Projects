package com.example.recyclerview;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivityone extends AppCompatActivity {
    RecyclerView recycler_view;
    String[] arr_name = {"cat","catc","Dogs","dolphin","ducklens","fox","hedgehog","miyao","photo","tabbyCat","cat","catc","Dogs","dolphin","ducklens","fox","hedgehog","miyao","photo","tabbyCat"};
    int[] arr_img = {R.drawable.cat,R.drawable.catc,R.drawable.dogs,R.drawable.dolphin,R.drawable.ducklens,R.drawable.fox,R.drawable.hedgehog,R.drawable.miyao,R.drawable.photo,R.drawable.tabbycat,R.drawable.cat,R.drawable.catc,R.drawable.dogs,R.drawable.dolphin,R.drawable.ducklens,R.drawable.fox,R.drawable.hedgehog,R.drawable.miyao,R.drawable.photo,R.drawable.tabbycat};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_activityone);
        recycler_view = (RecyclerView) findViewById(R.id.recycler_view);

        MyRecycler myRecycler = new MyRecycler(arr_img , arr_name);

        //===========LinearLayoutManager for ReCyclerView define===========....

//        recycler_view.setLayoutManager(new LinearLayoutManager(this));
//        recycler_view.setAdapter(myRecycler);

        //===========GridLayoutManager for ReCyclerView define===========....

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2 );
        recycler_view.setLayoutManager(gridLayoutManager);

        //===========StaggeredGridLayoutManager for ReCyclerView define===========....

//        StaggeredGridLayoutManager st = new StaggeredGridLayoutManager(2 , LinearLayoutManager.VERTICAL);
//        recycler_view.setLayoutManager(st);

        recycler_view.setAdapter(myRecycler);



    }
}