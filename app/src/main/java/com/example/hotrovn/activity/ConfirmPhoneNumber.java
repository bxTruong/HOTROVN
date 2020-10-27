package com.example.hotrovn.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hotrovn.R;

public class ConfirmPhoneNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_phone_number);
    }

    public void moveAidNews(View v) {
        Intent intent = new Intent(this, AidNews.class);
        startActivity(intent);
    }
}