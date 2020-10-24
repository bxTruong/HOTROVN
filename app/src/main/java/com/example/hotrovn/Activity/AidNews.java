package com.example.hotrovn.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.hotrovn.R;
import com.example.hotrovn.Utilities.ImgHandling;
import com.example.hotrovn.databinding.ActivityAidNewsBinding;

public class AidNews extends AppCompatActivity {

    ActivityAidNewsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid_news);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_aid_news);
    }
}