package com.example.darek.fragrmentchanger;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Fragment mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, mainFragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onBackPressed() {
        int count = getSupportFragmentManager().getBackStackEntryCount();
        if (count == 0) {
            super.onBackPressed();
        } else {
            getSupportFragmentManager().popBackStack();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        super.onSupportNavigateUp();
        onBackPressed();
        return true;
    }
}
