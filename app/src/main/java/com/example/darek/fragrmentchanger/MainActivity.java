package com.example.darek.fragrmentchanger;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    TextView tvSec;
    Button bF1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bF1 = (Button) findViewById(R.id.button);
        tvSec = (TextView) findViewById(R.id.tvSecond);

        bF1.setOnClickListener(this);
    }





    @Override
    public void onClick(View v) {

        //tvSec.setText("I'm second");

        Fragment newFragment = new MainFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.layout.first_fragment, newFragment);

        Fragment secoundFragment = new SecondFragment();
        FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
        transaction1.remove(secoundFragment);
     //   transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();
    }
}
