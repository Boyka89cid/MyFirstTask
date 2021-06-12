package com.example.myfirsttask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class Activity_2 extends AppCompatActivity
{
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        bottomNavigationView=findViewById(R.id.bottom_view);
        LoadFragment(new Home_page());
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item)
            {
                Fragment fragment;
                switch (item.getItemId())
                {
                    case R.id.menu_first_item:
                        fragment=new Home_page();
                        LoadFragment(fragment);
                        break;
                    case R.id.menu_second_item:
                        fragment=new Transaction_Page();
                        LoadFragment(fragment);
                        break;
                }
                return true;
            }
        });
    }

    public boolean LoadFragment(Fragment fragment)
    {
        if(fragment!=null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.home_frame_layout,fragment).commit();
            return true;
        }
        else
            return false;
    }
}