package com.example.hotrovn.activity.helper;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;

import com.example.hotrovn.activity.helper.fragments.InformationFragments;
import com.example.hotrovn.activity.helper.fragments.MapsFragments;
import com.example.hotrovn.databinding.ActivityAidNewsHelperBinding;
import com.example.hotrovn.model.City;
import com.example.hotrovn.model.Province;
import com.example.hotrovn.utilities.BaseActivity;
import com.example.hotrovn.R;
import com.example.hotrovn.utilities.HandingJson;
import com.shawnlin.numberpicker.NumberPicker;

import java.util.ArrayList;
import java.util.List;


public class AidNewsHelperActivity extends BaseActivity {
    ActivityAidNewsHelperBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid_news_helper);

        moveFragments_AidNews(R.id.frm_informationAid, new InformationFragments());

        binding = DataBindingUtil.setContentView(this, R.layout.activity_aid_news_helper);
    }

    public void moveMaps(View v) {
        moveFragments_AidNews(R.id.frm_informationAid, new MapsFragments());
    }

    public void moveInformation(View v) {
        moveFragments_AidNews(R.id.frm_informationAid, new InformationFragments());
    }

    public void search(View v) {
        binding.content.setVisibility(View.GONE);
        binding.bottomSheetDialog.setVisibility(View.VISIBLE);
    }

    public void loc(View v) {
        binding.content.setVisibility(View.VISIBLE);
        binding.bottomSheetDialog.setVisibility(View.GONE);
    }

    public void provincial(View v) {
        Dialog dialog = new Dialog(this);
        showDialog(dialog, R.layout.picker_location, R.drawable.custom_ll_aid_news, R.id.bt_save);

        String[] data = getList();

        handingNumberPicker((NumberPicker) dialog.findViewById(R.id.number_picker), data);
        dialog.show();
    }

    City city;
    private String[] getList() {
        List<Province> provinces = new ArrayList<>();
        city = HandingJson.getCountries(this);
        provinces = city.getProvince();//get compoment
        String[] stringsNameProvince = new String[provinces.size()];
        if(!provinces.isEmpty()) {
            for (int i = 0; i < provinces.size(); i++) {
                stringsNameProvince[i] = provinces.get(i).getName();
            }
        }
        return stringsNameProvince;
    };
}