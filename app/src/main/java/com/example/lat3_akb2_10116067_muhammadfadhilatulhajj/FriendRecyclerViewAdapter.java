package com.example.lat3_akb2_10116067_muhammadfadhilatulhajj;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FriendRecyclerViewAdapter extends RecyclerView.Adapter<FriendRecyclerViewAdapter.MyFriendholder> {
    // Provide a suitable constructor (depends on the kind of dataset)
    String text[] = {"BRIAN", "MONALISA", "ANABELLE"};
    Integer gambar[] = {R.drawable.ic_cowo, R.drawable.ic_cewe, R.drawable.ic_nenek};


    // Create new views (invoked by the layout manager)
    @Override
    public FriendRecyclerViewAdapter.MyFriendholder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_fragment__friendlist2, parent, false);
        MyFriendholder vh = new MyFriendholder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyFriendholder holder, int position) {
        holder.tvDaily.setText(text[position]);
        holder.ivDaily.setBackgroundResource(gambar[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return text.length;
    }

    public static class MyFriendholder extends RecyclerView.ViewHolder {
        public ImageView ivDaily;
        public TextView tvDaily;

        // each data item is just a string in this case
        public MyFriendholder(View v) {
            super(v);
            ivDaily = v.findViewById(R.id.ivDaily);
            tvDaily = v.findViewById(R.id.tvDaily);
        }

    }
}
