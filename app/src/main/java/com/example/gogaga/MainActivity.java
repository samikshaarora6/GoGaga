package com.example.gogaga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager =  findViewById(R.id.viewpagerDetail);
        tabLayout = (TabLayout) findViewById(R.id.tabsInLogin);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentTab1(), "Match Prefernces");
        adapter.addFragment(new FragmentTab2(), "App Preferences");
        viewPager.setAdapter(adapter);
        viewPager.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                return true;
            }
        });
        tabLayout.setupWithViewPager(viewPager);
    }

}
