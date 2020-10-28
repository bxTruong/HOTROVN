package com.example.hotrovn.activity.needRelief;

import androidx.databinding.DataBindingUtil;

import android.app.Dialog;
import android.os.Bundle;

import com.example.hotrovn.R;
import com.example.hotrovn.databinding.ActivityAidInformationBinding;
import com.example.hotrovn.model.ObjectItem;
import com.example.hotrovn.utilities.BaseActivity;
import com.example.hotrovn.utilities.adapter.AidInformationAdapter;
import com.example.hotrovn.utilities.adapter.AidNewsAdapter;

import java.util.ArrayList;

public class AidInformation extends BaseActivity {
    ActivityAidInformationBinding binding;
    ArrayList<ObjectItem> objectItems = new ArrayList<>();
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aid_information);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_aid_information);

        addObjectItem();
        AidInformationAdapter adapter = new AidInformationAdapter(objectItems, this, dialog);
        initRecyclerView(this, binding.rcvListNews, adapter);
    }

    private void addObjectItem() {
        objectItems.add(new ObjectItem(null, "Hộ thiện nguyện giáo hội phật giáo thành phố Quy Nhơn", null, "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", null, "Lê Ngọc Mai", "0903980553", "Trưởng nhóm thiện nguyện", "25/10/2020", "18:30"));
        objectItems.add(new ObjectItem(null, "Hộ thiện nguyện giáo hội phật giáo thành phố Quy Nhơn", null, "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", null, "Lê Ngọc Mai", "0903980553", "Trưởng nhóm thiện nguyện", "25/10/2020", "18:30"));
        objectItems.add(new ObjectItem(null, "Hộ thiện nguyện giáo hội phật giáo thành phố Quy Nhơn", null, "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", null, "Lê Ngọc Mai", "0903980553", "Trưởng nhóm thiện nguyện", "25/10/2020", "18:30"));
        objectItems.add(new ObjectItem(null, "Hộ thiện nguyện giáo hội phật giáo thành phố Quy Nhơn", null, "Áo phao, nước uống, đèn bin, áo mưa, áo quần.", null, "Lê Ngọc Mai", "0903980553", "Trưởng nhóm thiện nguyện", "25/10/2020", "18:30"));
    }
}