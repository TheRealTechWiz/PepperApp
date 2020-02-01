package com.example.designapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MyWord> list = new ArrayList<>();
        list.add(new MyWord(R.drawable.img1,R.drawable.star3,"JW Marriott","Sector 35, Chandigarh"));
        list.add(new MyWord(R.drawable.img3,R.drawable.star4,"The Weeding Resort","Zirakpur Shimla Highway"));

        RecyclerView listView = findViewById(R.id.horizontalScrollView2);
        CustomAdapter adapter = new CustomAdapter(list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        listView.setLayoutManager(mLayoutManager);
        listView.setAdapter(adapter);
        listView.setItemAnimator(new DefaultItemAnimator());

    }
}
