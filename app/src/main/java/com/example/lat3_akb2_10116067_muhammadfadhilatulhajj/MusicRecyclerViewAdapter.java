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

public class MusicRecyclerViewAdapter extends RecyclerView.Adapter<MusicRecyclerViewAdapter.MyMusicholder>  {
    // Provide a suitable constructor (depends on the kind of dataset)
    String text[] = {"TIDUR","MAKAN","GAME"};
    Integer gambar[] = {R.drawable.ic_tidur,R.drawable.ic_makan,R.drawable.ic_game};
    public MusicRecyclerViewAdapter() {
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MusicRecyclerViewAdapter.MyMusicholder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_music2, parent, false);
        MyMusicholder vh = new MyMusicholder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyMusicholder holder, int position) {
        holder.tvDaily.setText(text[position]);
        holder.ivDaily.setBackgroundResource(gambar[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return text.length;
    }

    public static class MyMusicholder extends RecyclerView.ViewHolder {
        public ImageView ivDaily;
        public TextView tvDaily;
        // each data item is just a string in this case
        public MyMusicholder(View v) {
            super(v);
            ivDaily = v.findViewById(R.id.ivDaily);
            tvDaily = v.findViewById(R.id.tvDaily);
        }

    }
}