package com.example.hotrovn.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hotrovn.R;
import com.example.hotrovn.activity.helper.AidNewsHelperActivity;
import com.example.hotrovn.utilities.BaseActivity;

public class ConfirmPhoneNumber extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_phone_number);
    }

    public void moveAidNews(View v) {
        handingMoveScreen_AidNews(this, AidNews.class, AidNewsHelperActivity.class);
    }
}