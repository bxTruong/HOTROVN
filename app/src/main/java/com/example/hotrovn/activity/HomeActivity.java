package com.example.hotrovn.activity;

import android.os.Bundle;
import android.view.View;

import com.example.hotrovn.R;
import com.example.hotrovn.utilities.BaseActivity;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void moveConfirmPhoneNeedRelief(View v) {
        moveScreen_Home(this, ConfirmPhoneNumber.class, 0);
    }

    public void moveConfirmPhoneHelper(View v) {
        moveScreen_Home(this, ConfirmPhoneNumber.class, 1);
    }
}