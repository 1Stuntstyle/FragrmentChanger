package com.example.darek.fragrmentchanger;

import android.widget.EditText;

/**
 * Created by Darek on 2017-05-08.
 */
public class SetData implements DataAccess {

    @Override
    public String sendData(EditText et) {

        String name;
        name = et.getText().toString();
        return  name+" it your name";
    }


}
