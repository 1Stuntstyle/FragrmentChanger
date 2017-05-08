package com.example.darek.fragrmentchanger;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Darek on 2017-04-26.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    private DataAccess dAccess;
    private EditText etName;
    private TextView tvName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container1, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_fragment, container1, false);

        Button bName = (Button) view.findViewById(R.id.bName);
        bName.setOnClickListener(this);
        etName = (EditText) view.findViewById(R.id.etName);
        tvName = (TextView) view.findViewById(R.id.tvSecond);

        dAccess = new SetData();

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bName:
                tvName.setText(dAccess.sendData(etName));
        }
    }
}
