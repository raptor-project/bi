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
public class Fundometer extends Fragment {


    public static Fundometer newInstance(int page, String title) {
        Fundometer fragmentFirst = new Fundometer();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    public Fundometer() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fundometer, container, false);
    }

}
