package com.example.myapplication.one;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter

     {

         public MyAdapter(@NonNull FragmentActivity fragmentActivity) {
             super(fragmentActivity);
         }

         public MyAdapter(FragmentManager supportFragmentManager, Lifecycle lifecycle) {
             super(supportFragmentManager  ,lifecycle);
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
