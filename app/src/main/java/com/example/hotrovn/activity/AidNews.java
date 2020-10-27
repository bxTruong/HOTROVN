package com.example.hotrovn.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hotrovn.activity.needRelief.CreateAidNewsActivity;
import com.example.hotrovn.R;
import com.example.hotrovn.databinding.ActivityAidNewsBinding;
import com.example.hotrovn.utilities.BaseActivity;

public class AidNews extends BaseActivity {

    ActivityAidNewsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid_news);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_aid_news);
    }

    public void moveCreateAidNews(View v) {
        moveScreen_All(this, CreateAidNewsActivity.class);
    }
}