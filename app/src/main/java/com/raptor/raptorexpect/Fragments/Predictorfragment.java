package com.raptor.raptorexpect.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.raptor.raptorexpect.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Predictorfragment extends Fragment {



    public static Predictorfragment newInstance(int page, String title) {
        Predictorfragment fragmentFirst = new Predictorfragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    public Predictorfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_predictorfragment, container, false);
    }

}
