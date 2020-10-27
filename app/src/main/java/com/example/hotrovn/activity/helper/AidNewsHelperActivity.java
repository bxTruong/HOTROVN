package com.example.hotrovn.activity.helper;

import android.os.Bundle;

import com.example.hotrovn.activity.helper.fragments.InformationFragments;
import com.example.hotrovn.activity.helper.fragments.MapsFragments;
import com.example.hotrovn.baseActivity.BaseActivity;
import com.example.hotrovn.R;

public class AidNewsHelperActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid_news_helper);
//        toast("ok");

        getSupportFragmentManager().beginTransaction().replace(R.id.frm_informationAid, new MapsFragments()).commit();
    }

    public void moveMaps() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frm_informationAid, new MapsFragments()).commit();
    }

    public void moveInformation() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frm_informationAid, new InformationFragments()).commit();
    }
}