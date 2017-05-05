package com.example.darek.fragrmentchanger;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Darek on 2017-04-26.
 */
public  class SecondFragment extends Fragment implements View.OnClickListener{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container1, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_fragment, container1, false);

        Button bBack = (Button) view.findViewById(R.id.button3);
        bBack.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        Fragment base = new ThirdFragment();
        FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
        transaction3.replace(R.id.container, base );
        transaction3.addToBackStack(null);
        transaction3.commit();




    }
}
