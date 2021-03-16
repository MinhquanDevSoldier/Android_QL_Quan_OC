package com.example.appqlquanoc;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TableLayout extends AppCompatActivity {
    //Initialize variable
    TabLayout tabTable;
    ViewPager viewPagerTable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        //Asign variable
        tabTable = findViewById(R.id.tab_table);
        viewPagerTable = findViewById(R.id.view_table);

        //Initialize Arraylist
        ArrayList<String> arrayList = new ArrayList<>();

        //Add tile in ArrayList
        arrayList.add("Khu A");
        arrayList.add("Khu B");
        arrayList.add("Khu C");
        for(int i = 0 ;i < 4;i++)
        {
            Button btnTable = new Button(this);
            //btnTable.setLayoutParams(new ViewPager.LayoutParams(new ViewPager.LayoutParams());
            btnTable.setId(i);
            btnTable.setText(i+"A");
            viewPagerTable.addView(btnTable);
        }
        //prepare view pager
        prepareViewPager(viewPagerTable,arrayList);
        //Setup with view pager
        tabTable.setupWithViewPager(viewPagerTable);

    }

    private void prepareViewPager(ViewPager viewPagerTable, ArrayList<String> arrayList) {
        //Initialize main adapter
        MainAdapter adapter = new MainAdapter(getSupportFragmentManager());
        //Initialize main fragment
        MainFragment fragment = new MainFragment();
        for(int i = 0;i<arrayList.size();i++)
        {
            //Initialize bundle
            Bundle bundle = new Bundle();
            //Put string
            bundle.putString("title",arrayList.get(i));
            //Set argument
            fragment.setArguments(bundle);
            //Add fragment
            adapter.addFragment(fragment,arrayList.get(i));
            //define new fragment
            fragment = new MainFragment();
        }
        //set adapter
        viewPagerTable.setAdapter(adapter);
    }

    private class MainAdapter extends FragmentPagerAdapter {

        //Initialize array list
        ArrayList<String> arrayList = new ArrayList<>();
        List<Fragment> fragmentList = new ArrayList<>();

        //create constructor
        public  void addFragment(Fragment fragment,String title)
        {
            //add Title
            arrayList.add(title);
            //add fragment
            fragmentList.add(fragment);
        }

        public MainAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            //Return fragment position
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            //Return fragment list size
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            //return array list position
            return arrayList.get(position);
        }
    }
}