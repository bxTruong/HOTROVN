package com.example.hotrovn.activity.needRelief;

import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.hotrovn.baseActivity.BaseActivity;
import com.example.hotrovn.R;
import com.example.hotrovn.databinding.ActivityCreateAidNewsBinding;

public class CreateAidNewsActivity extends BaseActivity   {
    ActivityCreateAidNewsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_aid_news);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_create_aid_news);

    }

}