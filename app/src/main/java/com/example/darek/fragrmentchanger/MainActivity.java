package com.example.darek.fragrmentchanger;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Fragment mainFragment = new MainFragment();
        getFragmentManager().beginTransaction().add(R.id.container, mainFragment).commit();
    }

    @Override
    public void onClick(View v) {

    }
}
