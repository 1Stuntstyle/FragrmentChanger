package com.example.darek.fragrmentchanger;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainFragment extends Fragment implements View.OnClickListener {

    private DataAccess dataAccess;
    private EditText editText;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        dataAccess = (DataAccess) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setDisplayHomeAsUpEnabled(false);

        View view = inflater.inflate(R.layout.first_fragment, container, false);
        Button bOpenSecondFragment = (Button) view.findViewById(R.id.bOpenSecondFragment);
        Button bOpenThirdFragment = (Button) view.findViewById(R.id.bOpenThirdFragment);
        bOpenSecondFragment.setOnClickListener(this);
        bOpenThirdFragment.setOnClickListener(this);
        editText = (EditText) view.findViewById(R.id.etName);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bOpenSecondFragment:
                dataAccess.sendData(editText.getText().toString());
                replaceFragment(new SecondFragment());
                break;
            case R.id.bOpenThirdFragment:
                replaceFragment(new ThirdFragment());
                break;
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction1 = getActivity().getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.container, fragment);
        transaction1.addToBackStack(null);
        transaction1.commit();
    }

    private void setDisplayHomeAsUpEnabled(boolean enabled) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        ActionBar actionBar = appCompatActivity.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(enabled);
        }
    }
}