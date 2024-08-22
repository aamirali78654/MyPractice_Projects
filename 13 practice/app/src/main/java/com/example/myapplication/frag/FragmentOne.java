package com.example.myapplication.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.myapplication.R;
import com.example.myapplication.frag.fOnedetails.Animals;
import com.example.myapplication.frag.fOnedetails.MyAdapterA;

import java.util.ArrayList;

public class FragmentOne extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

    {
        ListView list_view;
        ArrayList al;
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        list_view = (ListView) view.findViewById(R.id.list_view);
        al = new ArrayList();
        al.add(new Animals(R.drawable.cat,"Cat"));
        al.add(new Animals(R.drawable.catc,"Catc"));
        al.add(new Animals(R.drawable.dogs,"Dog"));
        al.add(new Animals(R.drawable.dolphin,"Dolphin"));
        al.add(new Animals(R.drawable.fox,"Fox"));
        al.add(new Animals(R.drawable.photo,"Photo"));
        al.add(new Animals(R.drawable.hedgehog,"hedgehog"));
        al.add(new Animals(R.drawable.tabbycat,"tabbyCat"));
        al.add(new Animals(R.drawable.cat,"Cat"));
        al.add(new Animals(R.drawable.catc,"Catc"));
        al.add(new Animals(R.drawable.dogs,"Dog"));
        al.add(new Animals(R.drawable.dolphin,"Dolphin"));
        al.add(new Animals(R.drawable.fox,"Fox"));
        al.add(new Animals(R.drawable.photo,"Photo"));
        al.add(new Animals(R.drawable.hedgehog,"hedgehog"));
        al.add(new Animals(R.drawable.tabbycat,"tabbyCat"));
        al.add(new Animals(R.drawable.cat,"Cat"));
        al.add(new Animals(R.drawable.catc,"Catc"));
        al.add(new Animals(R.drawable.dogs,"Dog"));
        al.add(new Animals(R.drawable.dolphin,"Dolphin"));
        al.add(new Animals(R.drawable.fox,"Fox"));
        al.add(new Animals(R.drawable.photo,"Photo"));
        al.add(new Animals(R.drawable.hedgehog,"hedgehog"));
        al.add(new Animals(R.drawable.tabbycat,"tabbyCat"));
        al.add(new Animals(R.drawable.cat,"Cat"));
        al.add(new Animals(R.drawable.catc,"Catc"));
        al.add(new Animals(R.drawable.dogs,"Dog"));
        al.add(new Animals(R.drawable.dolphin,"Dolphin"));
        al.add(new Animals(R.drawable.fox,"Fox"));
        al.add(new Animals(R.drawable.photo,"Photo"));
        al.add(new Animals(R.drawable.hedgehog,"hedgehog"));
        al.add(new Animals(R.drawable.tabbycat,"tabbyCat"));

        MyAdapterA myAdapterA = new MyAdapterA(getContext(),R.layout.image_text_fragment_one, al);
        list_view.setAdapter(myAdapterA);

        return view;
    }
}