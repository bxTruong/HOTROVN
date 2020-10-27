package com.example.hotrovn.baseActivity;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity{
    public void toast(String s){
        Toast.makeText(this, "s", Toast.LENGTH_SHORT).show();
    }
}
