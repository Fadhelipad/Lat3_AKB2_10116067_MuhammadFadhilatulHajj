package com.example.lat3_akb2_10116067_muhammadfadhilatulhajj;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lat3_akb2_10116067_muhammadfadhilatulhajj.Adapter.MusicPagerAdapter;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * to handle interaction events.
 * Use the {@link Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Music extends Fragment {

    private TabLayout tabLayout;

    private ViewPager viewPager;


    public static Music newInstance() {
        Music mu = new Music();
        return mu;
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    // ...


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_music, container, false);

        tabLayout = (TabLayout) v.findViewById(R.id.tablayout);

        viewPager = (ViewPager) v.findViewById(R.id.Pager);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        return v;

    }

    private void setupViewPager (ViewPager viewPager) {
        MusicPagerAdapter adapter = new MusicPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new MusicFragment(),  "Music");
        adapter.addFragment(new VideoFragment(), "Video");
        viewPager.setAdapter(adapter);


    }

}


