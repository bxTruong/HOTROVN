package com.example.hotrovn.activity.helper.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotrovn.R;
import com.example.hotrovn.activity.helper.AidBattle;
import com.example.hotrovn.model.ObjectItem;
import com.example.hotrovn.utilities.adapter.AidInformation2Adapter;

import java.util.ArrayList;

public class InformationFragments extends Fragment {
    private RecyclerView mRcvListNews;

    ArrayList<ObjectItem> objectItems = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragments_information, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRcvListNews = view.findViewById(R.id.rcv_listNews);
        addObjectItem();
        initRecyclerViewUser();
    }

    private void addObjectItem() {
        objectItems.add(new ObjectItem("Quảng Bình", null, "Đông Thanh, Đông Hà, Quảng Bình", "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", "(3)", "Lê Ngọc Mai", "0903980553", "Trưởng nhóm thiện nguyện", "25/10/2020", "18:30"));
        objectItems.add(new ObjectItem("Quảng Bình", null, "Đông Thanh, Đông Hà, Quảng Bình", "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", "(3)", "Lê Ngọc Mai", "0903980553", "Trưởng nhóm thiện nguyện", "25/10/2020", "18:30"));
        objectItems.add(new ObjectItem("Quảng Bình", null, "Đông Thanh, Đông Hà, Quảng Bình", "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", "(3)", "Lê Ngọc Mai", "0903980553", "Trưởng nhóm thiện nguyện", "25/10/2020", "18:30"));
    }

    private void initRecyclerViewUser() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        mRcvListNews.setLayoutManager(layoutManager);
        AidInformation2Adapter adapter = new AidInformation2Adapter(objectItems, getContext());
        mRcvListNews.setAdapter(adapter);
    }
}
