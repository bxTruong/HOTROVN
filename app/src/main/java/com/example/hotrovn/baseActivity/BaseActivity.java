package com.example.hotrovn.baseActivity;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hotrovn.R;
import com.example.hotrovn.activity.helper.fragments.MapsFragments;

public class BaseActivity extends AppCompatActivity{
    public void toast(String s){
        Toast.makeText(this, "s", Toast.LENGTH_SHORT).show();
    }

//    public void moveFragments(int a, Class c)
//    {
//        getSupportFragmentManager().beginTransaction().replace(a, c).commit();
//    }
}
