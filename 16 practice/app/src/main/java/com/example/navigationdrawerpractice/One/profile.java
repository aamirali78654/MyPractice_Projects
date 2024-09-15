package com.example.navigationdrawerpractice.One;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawerpractice.R;


public class profile extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
          //============ Profile================>>
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}