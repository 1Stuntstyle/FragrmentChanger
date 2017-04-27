package com.example.darek.fragrmentchanger;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Darek on 2017-04-26.
 */
public  class SecondFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container1, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_fragment, container1, false);
        return view;
    }
}
