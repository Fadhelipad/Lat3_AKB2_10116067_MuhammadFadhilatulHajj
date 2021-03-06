package com.example.lat3_akb2_10116067_muhammadfadhilatulhajj;


import java.util.List;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lat3_akb2_10116067_muhammadfadhilatulhajj.R;

public class VideoRecyclerViewAdapter extends RecyclerView.Adapter<VideoRecyclerViewAdapter.MyVideoholder>  {
    // Provide a suitable constructor (depends on the kind of dataset)
    String text[] = {"Blackpink - DUDUDUDU","One OK Rock - The Beginning","Kodaline - High Hopes","The Avenger - ENDGAME"};
    Integer gambar[] = {R.drawable.ic_video1,R.drawable.ic_video2,R.drawable.ic_video3,R.drawable.ic_video5};
    public VideoRecyclerViewAdapter() {
    }

    // Create new views (invoked by the layout manager)
    @Override
    public VideoRecyclerViewAdapter.MyVideoholder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_video2, parent, false);
        MyVideoholder vh = new MyVideoholder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyVideoholder holder, int position) {
        holder.tvDaily.setText(text[position]);
        holder.ivDaily.setBackgroundResource(gambar[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return text.length;
    }

    public static class MyVideoholder extends RecyclerView.ViewHolder {
        public ImageView ivDaily;
        public TextView tvDaily;
        // each data item is just a string in this case
        public MyVideoholder(View v) {
            super(v);
            ivDaily = v.findViewById(R.id.ivDaily);
            tvDaily = v.findViewById(R.id.tvDaily);
        }

    }
}