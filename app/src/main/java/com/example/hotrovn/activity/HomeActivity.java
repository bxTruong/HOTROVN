package com.example.hotrovn.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hotrovn.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void moveConfirmPhoneNumber(View v) {
        Intent intent = new Intent(this, ConfirmPhoneNumber.class);
        startActivity(intent);
    }
}