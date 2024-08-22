package com.example.myapplication;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import com.example.myapplication.frag.FragmentOne;
import com.example.myapplication.frag.FragmentThree;
import com.example.myapplication.frag.FragmentTwo;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tab_main;
    ViewPager2 frmel_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tab_main = findViewById(R.id.tab_main);
        frmel_main = findViewById(R.id.frmel_main);

//========Tab Layout action bar icons and name declaired=======>>>
        TabLayout.Tab one= tab_main.newTab();
        one.setText("Chat");
        one.setIcon(R.drawable.chat);
        tab_main.addTab(one);

        TabLayout.Tab two = tab_main.newTab();
        two.setText("Status");
        two.setIcon(R.drawable.status);
        tab_main.addTab(two);

        TabLayout.Tab three = tab_main.newTab();
        three.setText("Call");
        three.setIcon(R.drawable.call);
        tab_main.addTab(three);

        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(),getLifecycle());

        frmel_main.setAdapter(myAdapter);
         frmel_main.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
                @Override
                public void onPageSelected(int position)
                {
                 super.onPageSelected(position);
                 tab_main.selectTab(tab_main.getTabAt(position));
                }
         });

//        //===================fragment id declaired==================>>>>>
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(R.id.frmel_main,new FragmentOne());
//        fragmentTransaction.commit();

//        tab_main.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
//        {
//
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                Fragment fragment = null;
//                switch (tab.getPosition())
//                {
//                    case 0:
//                        fragment = new FragmentOne();
//                        break;
//                    case 1:
//                        fragment = new FragmentTwo();
//                        break;
//                    case 2:
//                        fragment = new FragmentThree();
//                        break;
//                }
//
//                FragmentManager fManager = getSupportFragmentManager();
//                FragmentTransaction fTransaction = fManager.beginTransaction();
//                fTransaction.replace(R.id.frmel_main, fragment);
//                fTransaction.commit();
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
    }
}