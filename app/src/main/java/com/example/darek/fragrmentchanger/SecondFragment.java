package com.example.darek.fragrmentchanger;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Darek on 2017-04-26.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    private TextView tvName;
    private DataAccess dataAccess;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        dataAccess = (DataAccess) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container1, Bundle savedInstanceState) {

        setDisplayHomeAsUpEnabled(true);

        View view = inflater.inflate(R.layout.second_fragment, container1, false);
        Button bName = (Button) view.findViewById(R.id.bName);
        bName.setOnClickListener(this);
        tvName = (TextView) view.findViewById(R.id.tvSecond);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bName:
                tvName.setText(dataAccess.getData());
        }
    }

    private void setDisplayHomeAsUpEnabled(boolean enabled) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        ActionBar actionBar = appCompatActivity.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(enabled);
        }
    }
}
