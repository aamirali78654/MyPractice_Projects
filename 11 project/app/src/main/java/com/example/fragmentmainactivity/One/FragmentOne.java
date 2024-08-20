package com.example.fragmentmainactivity.One;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.fragmentmainactivity.R;


public class FragmentOne extends Fragment {
       View v;

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)

   {
       v = inflater.inflate(R.layout.fragment_one, container, false);

        // Inflate the layout for this fragment
        return v;
    }
}