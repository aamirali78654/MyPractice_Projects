package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.frag.FragmentOne;
import com.example.myapplication.frag.FragmentThree;
import com.example.myapplication.frag.FragmentTwo;

public class MyAdapter extends FragmentStateAdapter

    {
        public MyAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position)
        {
            switch (position)
            {
                case 0:
                    return new FragmentOne();
                case 1:
                    return new FragmentTwo();
                case 2:
                    return new FragmentThree();
                default:
                    return  null;
            }
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }
