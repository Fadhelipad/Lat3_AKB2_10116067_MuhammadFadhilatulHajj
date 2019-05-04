package com.example.lat3_akb2_10116067_muhammadfadhilatulhajj;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * to handle interaction events.
 * Use the {@link Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home extends Fragment {


    public static Home newInstance() {
        Home fa = new Home();
        return fa;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);


        ImageButton ig = (ImageButton) v.findViewById(R.id.ig);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToIg();
            }

            private void goToIg() {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/fadhel.ipad"));

                startActivity(browserIntent);
            }
        });
        ImageButton call = (ImageButton) v.findViewById(R.id.incall);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTocall();
            }

            private void goTocall() {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:082218329362"));

                startActivity(browserIntent);

            }
        });
        ImageButton tw = (ImageButton) v.findViewById(R.id.twitter);
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTotw();
            }

            private void goTotw() {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/@Fadhel_ipad"));

                startActivity(browserIntent);

            }
        });
        return v;
    }
}

