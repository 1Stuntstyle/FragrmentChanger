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
public class ThirdFragment extends Fragment implements View.OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container2, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.third_fragment, container2, false);

        Button bGoBack = (Button) view.findViewById(R.id.button2);
        bGoBack.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Fragment mainFragment = new MainFragment();
        FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
        transaction3.replace(R.id.container, mainFragment);
        transaction3.addToBackStack(null);
        transaction3.commit();
    }
}
