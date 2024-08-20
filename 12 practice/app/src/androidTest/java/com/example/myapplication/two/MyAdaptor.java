package com.example.myapplication.two;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.one.FragmentOne;
import com.example.myapplication.one.FragmentThree;
import com.example.myapplication.one.FragmentTwo;

public class MyAdaptor extends FragmentStateAdapter

    {
        public MyAdaptor(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position)

        {
            switch (position)
            {
                case 0:
                    FragmentOne one = new FragmentOne();
                    return one;
                case 1:
                    FragmentTwo two = new FragmentTwo();
                    return two;
                case 2:
                    FragmentThree three = new FragmentThree();
                    return three;
                default:
                    return null;
            }
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }
