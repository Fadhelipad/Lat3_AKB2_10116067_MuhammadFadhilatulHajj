package com.example.lat3_akb2_10116067_muhammadfadhilatulhajj;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class GaleriRecycleViewAdapter extends RecyclerView.Adapter<GaleriRecycleViewAdapter.MyGaleridholder> {
    // Provide a suitable constructor (depends on the kind of dataset)
    Integer gambar[] = {R.drawable.ic_manager, R.drawable.ic_jeni, R.drawable.ic_lisa,R.drawable.ic_jiso,R.drawable.ic_foto,R.drawable.ic_vanesha};


    // Create new views (invoked by the layout manager)
    @Override
    public GaleriRecycleViewAdapter.MyGaleridholder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_galeri, parent, false);
        MyGaleridholder vh = new MyGaleridholder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyGaleridholder holder, int position) {
        holder.ivDaily.setBackgroundResource(gambar[position]);

    }

    @Override
    public int getItemCount() {
        return gambar.length;
    }

    // Return the size of your dataset (invoked by the layout manager)

    public static class MyGaleridholder extends RecyclerView.ViewHolder {
        public ImageView ivDaily;

        // each data item is just a string in this case
        public MyGaleridholder(View v) {
            super(v);
            ivDaily = v.findViewById(R.id.ivDaily);
        }

    }
}
