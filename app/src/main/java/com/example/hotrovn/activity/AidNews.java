package com.example.hotrovn.activity;

import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.hotrovn.activity.needRelief.CreateAidNewsActivity;
import com.example.hotrovn.R;

import com.example.hotrovn.databinding.ActivityAidNewsBinding;
import com.example.hotrovn.model.ObjectItem;
import com.example.hotrovn.utilities.BaseActivity;
import com.example.hotrovn.utilities.adapter.AidNewsAdapter;

import java.util.ArrayList;

public class AidNews extends BaseActivity {
    ActivityAidNewsBinding binding;
    ArrayList<ObjectItem> objectItems = new ArrayList<>();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid_news);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_aid_news);

        addObjectItem();
        AidNewsAdapter adapter = new AidNewsAdapter(objectItems, this);
        initRecyclerView(this, binding.rcvListNews, adapter);
    }

    private void addObjectItem() {
        objectItems.add(new ObjectItem(null, null, "Đông Thanh, Đông Hà, Quảng Bình", "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", "(3)", null, null, null, "25/10/2020", null));
        objectItems.add(new ObjectItem(null, null, "Đông Thanh, Đông Hà, Quảng Bình", "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", "(3)", null, null, null, "25/10/2020", null));
        objectItems.add(new ObjectItem(null, null, "Đông Thanh, Đông Hà, Quảng Bình", "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", "(3)", null, null, null, "25/10/2020", null));
        objectItems.add(new ObjectItem(null, null, "Đông Thanh, Đông Hà, Quảng Bình", "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", "(3)", null, null, null, "25/10/2020", null));
    }

    public void moveCreateAidNews(View v) {
        moveScreen_All(this, CreateAidNewsActivity.class);
    }
}