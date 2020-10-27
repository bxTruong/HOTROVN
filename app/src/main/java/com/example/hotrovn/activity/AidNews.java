package com.example.hotrovn.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hotrovn.activity.needRelief.CreateAidNewsActivity;
import com.example.hotrovn.R;

import com.example.hotrovn.databinding.ActivityAidNewsBinding;
import com.example.hotrovn.model.ObjectAidNews;
import com.example.hotrovn.utilities.BaseActivity;
import com.example.hotrovn.utilities.adapter.AidNewsAdapter;

import java.util.ArrayList;

public class AidNews extends BaseActivity {
    ActivityAidNewsBinding binding;
    ArrayList<ObjectAidNews> objectAidNews = new ArrayList<>();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid_news);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_aid_news);

        addObjectAidNews();
        AidNewsAdapter adapter = new AidNewsAdapter(objectAidNews, this);
        initRecyclerView(this, binding.rcvListNews, adapter);
    }

    private void addObjectAidNews() {
        objectAidNews.add(new ObjectAidNews(R.drawable.location, R.drawable.distributed, R.drawable.delivery_cart, "Đông Thanh, Đông Hà, Quảng Bình", "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", "(3)", "25/10/2020"));
        objectAidNews.add(new ObjectAidNews(R.drawable.location, R.drawable.distributed, R.drawable.delivery_cart, "Đông Thanh, Đông Hà, Quảng Bình", "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", "(3)", "25/10/2020"));
        objectAidNews.add(new ObjectAidNews(R.drawable.location, R.drawable.distributed, R.drawable.delivery_cart, "Đông Thanh, Đông Hà, Quảng Bình", "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", "(3)", "25/10/2020"));
    }

    public void moveCreateAidNews(View v) {
        moveScreen_All(this, CreateAidNewsActivity.class);
    }
}