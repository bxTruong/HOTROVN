package com.example.hotrovn.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hotrovn.activity.needRelief.CreateAidNewsActivity;
import com.example.hotrovn.R;
import com.example.hotrovn.databinding.ActivityAidNewsBinding;

public class AidNews extends AppCompatActivity {

    ActivityAidNewsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid_news);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_aid_news);
    }

    public void moveCreateAidNews(View v) {
        Intent intent = new Intent(this, CreateAidNewsActivity.class);
        startActivity(intent);
    }
}