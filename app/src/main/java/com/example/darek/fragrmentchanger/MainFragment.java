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
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Fragment secondFragment = new SecondFragment();
        FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
        transaction1.replace(R.id.container, secondFragment);
        transaction1.addToBackStack(null);
        transaction1.commit();
    }
}