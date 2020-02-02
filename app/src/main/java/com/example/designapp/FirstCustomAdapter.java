package com.example.designapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class FirstCustomAdapter extends RecyclerView.Adapter<FirstCustomAdapter.MyViewHolder> {
    private ArrayList<MyWord> list;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView name,loc,days;

        public MyViewHolder(@NonNull View view) {
            super(view);
            this.img = view.findViewById(R.id.imageView);
            this.name = view.findViewById(R.id.textView);
            this.days = view.findViewById(R.id.textView2);
            this.loc = view.findViewById(R.id.textView1);
        }

    }

    public FirstCustomAdapter(ArrayList<MyWord> clist) {
        this.list = clist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.first, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyWord crlist = list.get(position);
        holder.img.setImageResource(crlist.getimg1());
        holder.name.setText(crlist.getitle());
        holder.loc.setText(crlist.getloc());
        holder.days.setText(crlist.getdays());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }



}



