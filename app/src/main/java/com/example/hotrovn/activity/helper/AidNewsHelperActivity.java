package com.example.hotrovn.activity.helper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hotrovn.activity.helper.fragments.InformationFragments;
import com.example.hotrovn.activity.helper.fragments.MapsFragments;
import com.example.hotrovn.utilities.BaseActivity;
import com.example.hotrovn.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class AidNewsHelperActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid_news_helper);

        moveFragments_AidNews(R.id.frm_informationAid, new MapsFragments());
    }

    public void moveMaps(View v) {
        moveFragments_AidNews(R.id.frm_informationAid, new MapsFragments());
    }

    public void moveInformation(View v) {
        moveFragments_AidNews(R.id.frm_informationAid, new InformationFragments());
    }

    public void search(View v) {
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this, R.style.BottomSheetDialogTheme);
        showBottomSheetDialog_AidNewsHelper(bottomSheetDialog,R.layout.dialogs_bottomsheet_aid_news_helper, R.id.bottomSheetContainer, R.id.img_close);
    }
}