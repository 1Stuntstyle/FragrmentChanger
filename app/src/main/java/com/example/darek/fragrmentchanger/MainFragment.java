package com.example.darek.fragrmentchanger;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Darek on 2017-04-25.
 */
public class MainFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        Button button = (Button) view.findViewById(R.id.button);
        Button button2 = (Button) view.findViewById(R.id.button2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button:
                Fragment thirdFragment = new ThirdFragment();
                FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                transaction1.replace(R.id.container, thirdFragment);
                transaction1.addToBackStack(null);
                transaction1.commit();
                break;


            case R.id.button2:
                Fragment secondFragment = new SecondFragment();
                FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                transaction2.replace(R.id.container, secondFragment);
                transaction2.addToBackStack(null);
                transaction2.commit();
                break;
        }
    }
}