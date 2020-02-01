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

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private ArrayList<MyWord> list;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView img,star;
        private TextView name,loc;

        public MyViewHolder(@NonNull View view) {
            super(view);
            this.img = view.findViewById(R.id.imageView11);
            this.star = view.findViewById(R.id.imageView13);
            this.name = view.findViewById(R.id.textView10);
            this.loc = view.findViewById(R.id.textView11);
        }

    }

    public CustomAdapter(ArrayList<MyWord> clist) {
        this.list = clist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.second, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyWord crlist = list.get(position);
        holder.img.setImageResource(crlist.getimg1());
        holder.star.setImageResource(crlist.getimg2());
        holder.name.setText(crlist.getitle());
        holder.loc.setText(crlist.getloc());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }



}




//    public CustomAdapter(Context context, ArrayList<MyWord> arrayList) {
//        super(context,0, arrayList);
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        View listitemView = convertView;
//        if (listitemView == null){listitemView = LayoutInflater.from(getContext()).inflate(R.layout.second,parent,false);
//        }
//        MyWord currentWord = getItem(position);
//        ImageView img = listitemView.findViewById(R.id.imageView11);
//        img.setImageResource(currentWord.getimg1());
//        ImageView imgstar = listitemView.findViewById(R.id.imageView13);
//        imgstar.setImageResource(currentWord.getimg2());
//        TextView tmag = listitemView.findViewById(R.id.textView10);
//        tmag.setText(currentWord.getitle());
//        TextView tloc = listitemView.findViewById(R.id.textView11);
//        tloc.setText(currentWord.getloc());
//
//        return listitemView;
//    }


