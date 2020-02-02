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

        ArrayList<MyWord> listsec = new ArrayList<>();
        listsec.add(new MyWord(R.drawable.img4,R.drawable.star4,"Zee loft","Sector 35, Chandigarh"));
        listsec.add(new MyWord(R.drawable.img2,R.drawable.star4,"Peddlers","Elante Mall, Chandigarh"));
        RecyclerView recyclerView = findViewById(R.id.horizontalScrollView3);
        CustomAdapter adaptersec = new CustomAdapter(listsec);
        RecyclerView.LayoutManager mLayoutManagersec = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManagersec);
        recyclerView.setAdapter(adaptersec);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        ArrayList<MyWord> listfir = new ArrayList<>();
        listfir.add(new MyWord(R.drawable.img6,"Dubai & Abu Dhabi","₹49,999/-","5 Nights, 6 Days"));
        listfir.add(new MyWord(R.drawable.img5,"Bangkok & Pattaya","₹49,999/-","4 Nights, 5 Days"));
        RecyclerView recyclerViewf = findViewById(R.id.horizontalScrollView);
        FirstCustomAdapter adapterf = new FirstCustomAdapter(listfir);
        RecyclerView.LayoutManager mLayoutManagerf = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewf.setLayoutManager(mLayoutManagerf);
        recyclerViewf.setAdapter(adapterf);
        recyclerViewf.setItemAnimator(new DefaultItemAnimator());

    }
}
