package com.example.lat3_akb2_10116067_muhammadfadhilatulhajj;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lat3_akb2_10116067_muhammadfadhilatulhajj.Adapter.DailyPagerAdapter;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * to handle interaction events.
 * Use the {@link Home#newInstance} factory method to
 * create an instance of this fragment.
 */


public class Daily extends Fragment {
    private TabLayout tabLayout;

    private ViewPager viewPager;

    public static Daily newInstance() {
        Daily da = new Daily();
        return da;
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
        View v = inflater.inflate(R.layout.fragment_daily, container, false);

        tabLayout = (TabLayout) v.findViewById(R.id.tablayout);

        viewPager = (ViewPager) v.findViewById(R.id.Pager);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        return v;

    }

    private void setupViewPager (ViewPager viewPager) {
        DailyPagerAdapter adapter = new DailyPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new DailyFragment(),  "Daily Activity");
        adapter.addFragment(new FriendFragment(), "Friend List");
        viewPager.setAdapter(adapter);


    }

}

