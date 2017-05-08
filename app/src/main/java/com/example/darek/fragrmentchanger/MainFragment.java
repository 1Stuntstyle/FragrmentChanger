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
                replaceFragment(new SecondFragment());
                break;
            case R.id.bOpenThirdFragment:
                replaceFragment(new ThirdFragment());
                break;
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
        transaction1.replace(R.id.container, fragment);
        transaction1.addToBackStack(null);
        transaction1.commit();
    }
}