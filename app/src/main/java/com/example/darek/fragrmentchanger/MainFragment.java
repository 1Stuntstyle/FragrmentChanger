package com.example.darek.fragrmentchanger;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        Button bOpenSecondFragment = (Button) view.findViewById(R.id.bOpenSecondFragment);
        Button bOpenThirdFragment = (Button) view.findViewById(R.id.bOpenThirdFragment);
        bOpenSecondFragment.setOnClickListener(this);
        bOpenThirdFragment.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bOpenSecondFragment:
                Fragment thirdFragment = new ThirdFragment();
                FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                transaction1.replace(R.id.container, thirdFragment);
                transaction1.addToBackStack(null);
                transaction1.commit();
                break;
            case R.id.bOpenThirdFragment:
                Fragment secondFragment = new SecondFragment();
                FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                transaction2.replace(R.id.container, secondFragment);
                transaction2.addToBackStack(null);
                transaction2.commit();
                break;
        }
    }
}