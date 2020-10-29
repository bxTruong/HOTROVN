package com.example.hotrovn.activity.helper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.example.hotrovn.R;
import com.example.hotrovn.activity.AidNews;
import com.example.hotrovn.utilities.BaseActivity;

public class AidBattle extends BaseActivity {
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid_battle);

        dialog = new Dialog(this);
        showDialog_CreateAidNews(dialog, R.layout.dialogs_aid_battle, R.drawable.custom_ll_aid_news, R.id.bt_save, this, AidInformationHelper.class);
    }

    public void showDialog(View v) {
        dialog.show();
    }

    public void finishbt(View v)
    {
        finish();
    }
}