package com.example.hotrovn.utilities;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.shawnlin.numberpicker.NumberPicker;

public class BaseActivity extends AppCompatActivity {
    public void moveScreen_All(Context context, Class classs) {
        Intent intent = new Intent(context, classs);
        startActivity(intent);
    }

    public void glideImg(Context context, int img, View view) {
        Glide.with(context)
                .load(img)
                .into((ImageView) view);
    }

    public void initRecyclerView(Context context, RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void moveScreen_Home(Context context, Class classs, Integer a) {
        Intent intent = new Intent(context, classs);
        intent.putExtra("code", a);
        startActivity(intent);
    }

    public void handingMoveScreen_AidNews(Context context, Class a, Class b) {
        Intent getIntent = getIntent();
        Intent intent;

        if (getIntent.getIntExtra("code", 0) == 1) {
            intent = new Intent(context, b);
        } else {
            intent = new Intent(context, a);
        }
        startActivity(intent);
    }

    public void moveFragments_AidNews(int a, Fragment c) {
        getSupportFragmentManager().beginTransaction().replace(a, c).commit();
    }

    public void showDialog_CreateAidNews(final Dialog dialog, int layoutDialog, int customDialog, int bt, final Context context, final Class classs) {
        dialog.setContentView(layoutDialog);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            dialog.getWindow().setBackgroundDrawable(getDrawable(customDialog));
        }
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);

        Button save = dialog.findViewById(bt);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                moveScreen_All(context, classs);
            }
        });
    }

    public void showDialog(final Dialog dialog, int layoutDialog, int customDialog, int bt) {
        dialog.setContentView(layoutDialog);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            dialog.getWindow().setBackgroundDrawable(getDrawable(customDialog));
        }
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);

        Button save = dialog.findViewById(bt);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }

    public void handingNumberPicker(NumberPicker numberPicker, String[] data) {
        numberPicker.setMinValue(1);//vị trí nhỏ nhất
        numberPicker.setMaxValue(data.length);//vị trí lớn nhất
        numberPicker.setDisplayedValues(data);//lấy data
        numberPicker.setValue(1);//vị trí chọn

        // Set fading edge enabled
        numberPicker.setFadingEdgeEnabled(true);

        // Set scroller enabled
        numberPicker.setScrollerEnabled(true);

        // Set wrap selector wheel
        numberPicker.setWrapSelectorWheel(true);

        // Set accessibility description enabled
        numberPicker.setAccessibilityDescriptionEnabled(true);
    }
}
