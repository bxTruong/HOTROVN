package com.example.hotrovn.activity.needRelief;

import androidx.databinding.DataBindingUtil;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.example.hotrovn.activity.AidNews;
import com.example.hotrovn.databinding.ActivityCreateAidNewsBinding;
import com.example.hotrovn.utilities.BaseActivity;
import com.example.hotrovn.R;

public class CreateAidNewsActivity extends BaseActivity {
    ActivityCreateAidNewsBinding binding;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_aid_news);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_create_aid_news);

        dialog = new Dialog(this);
        showDialog_CreateAidNews(dialog, R.layout.dialogs_create_aid_news, R.drawable.custom_ll_aid_news, R.id.bt_save, this, AidNews.class);
    }

    public void showDialog(View v) {
        dialog.show();
    }
}