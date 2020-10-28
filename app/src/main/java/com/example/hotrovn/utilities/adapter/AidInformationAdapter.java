package com.example.hotrovn.utilities.adapter;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hotrovn.R;
import com.example.hotrovn.model.ObjectItem;

import java.util.ArrayList;

public class AidInformationAdapter extends RecyclerView.Adapter<AidInformationAdapter.ViewHolder> {
    ArrayList<ObjectItem> objectAidNews;
    Context context;
    Dialog dialog;

    public AidInformationAdapter(ArrayList<ObjectItem> objectAidNews, Context context, Dialog dialog) {
        this.objectAidNews = objectAidNews;
        this.context = context;
        this.dialog = dialog;
    }

    @NonNull
    @Override
    public AidInformationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_aid_information, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AidInformationAdapter.ViewHolder holder, int position) {
        holder.mTxtSocialCare.setText(objectAidNews.get(position).getTxtSocialCare());

        holder.mTxtDistraibuted.setText(objectAidNews.get(position).getTxtDistraibuted());

        holder.mTxtDate1.setText(objectAidNews.get(position).getTxtDate());
        holder.mTxtTime1.setText(objectAidNews.get(position).getTxtTime());

        holder.mTxtName.setText(objectAidNews.get(position).getTxtName());
        holder.mTxtPhoneNumber.setText(objectAidNews.get(position).getTxtPhoneNumber());
        holder.mTxtPosition.setText(objectAidNews.get(position).getTxtPosition());

        holder.mTxtSeeDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialogs_aid_information);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    dialog.getWindow().setBackgroundDrawable(context.getDrawable(R.drawable.custom_ll_aid_news));
                }
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);

                Button save = dialog.findViewById(R.id.bt_close);

                save.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return objectAidNews.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTxtSocialCare;
        private TextView mTxtDistraibuted;
        private TextView mTxtSeeDetails;
        private TextView mTxtDate1;
        private TextView mTxtTime1;
        private TextView mTxtAPM1;
        private TextView mTxtName;
        private TextView mTxtPhoneNumber;
        private TextView mTxtPosition;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mTxtSocialCare = itemView.findViewById(R.id.txt_socialCare);
            mTxtDistraibuted = itemView.findViewById(R.id.txt_distraibuted);
            mTxtSeeDetails = itemView.findViewById(R.id.txt_seeDetails);
            mTxtDate1 = itemView.findViewById(R.id.txt_date1);
            mTxtTime1 = itemView.findViewById(R.id.txt_time1);
            mTxtAPM1 = itemView.findViewById(R.id.txt_APM1);
            mTxtName = itemView.findViewById(R.id.txt_name);
            mTxtPhoneNumber = itemView.findViewById(R.id.txt_phoneNumber);
            mTxtPosition = itemView.findViewById(R.id.txt_position);
        }
    }
}
