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
       Button button_login;
       v = inflater.inflate(R.layout.fragment_one, container, false);
       button_login = (Button) v.findViewById(R.id.button_login);
//================this coding part show the connect the fragment One========>>>
       button_login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               FragmentManager fragmentManager = getParentFragmentManager();
               FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               fragmentTransaction.replace(R.id.fragment_main,new FragmentTwo());
               fragmentTransaction.commit();
           }
       });

        // Inflate the layout for this fragment
        return v;
    }
}