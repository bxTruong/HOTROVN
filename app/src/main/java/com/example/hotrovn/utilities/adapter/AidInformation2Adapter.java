package com.example.hotrovn.utilities.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotrovn.R;
import com.example.hotrovn.model.ObjectItem;

import java.util.ArrayList;

public class AidInformation2Adapter extends RecyclerView.Adapter<AidInformation2Adapter.ViewHolder> {
    ArrayList<ObjectItem> objectItems;
    Context context;

    public AidInformation2Adapter(ArrayList<ObjectItem> objectItems, Context context) {
        this.objectItems = objectItems;
        this.context = context;
    }

    @NonNull
    @Override
    public AidInformation2Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_aid_information2_helper, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AidInformation2Adapter.ViewHolder holder, int position) {
        holder.mTxtCity.setText(objectItems.get(position).getTxtCity());
        holder.mTxtLocation.setText(objectItems.get(position).getTxtLocation());

        holder.mTxtDistraibuted.setText(objectItems.get(position).getTxtDistraibuted());
        holder.mTxtNumberReliefCampaign.setText(objectItems.get(position).getTxtNumberReliefCampaign());

        holder.mTxtDate.setText(objectItems.get(position).getTxtDate());
        holder.mTxtTime.setText(objectItems.get(position).getTxtTime());

        holder.mTxtName.setText(objectItems.get(position).getTxtName());
        holder.mTxtPhoneNumber.setText(objectItems.get(position).getTxtPhoneNumber());
        holder.mTxtPosition.setText(objectItems.get(position).getTxtPosition());
    }

    @Override
    public int getItemCount() {
        return objectItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTxtCity;
        private TextView mTxtLocation;
        private TextView mTxtDistraibuted;
        private TextView mTxtNumberReliefCampaign;
        private TextView mTxtName;
        private TextView mTxtPhoneNumber;
        private TextView mTxtPosition;
        private TextView mTxtDate;
        private TextView mTxtTime;
        private TextView mTxtAPM;
        private TextView mTxtSeeDetails;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTxtCity = itemView.findViewById(R.id.txt_city);
            mTxtLocation = itemView.findViewById(R.id.txt_location);
            mTxtDistraibuted = itemView.findViewById(R.id.txt_distraibuted);
            mTxtNumberReliefCampaign = itemView.findViewById(R.id.txt_numberReliefCampaign);
            mTxtName = itemView.findViewById(R.id.txt_name);
            mTxtPhoneNumber = itemView.findViewById(R.id.txt_phoneNumber);
            mTxtPosition = itemView.findViewById(R.id.txt_position);
            mTxtDate = itemView.findViewById(R.id.txt_date);
            mTxtTime = itemView.findViewById(R.id.txt_Time);
            mTxtAPM = itemView.findViewById(R.id.txt_APM);
            mTxtSeeDetails = itemView.findViewById(R.id.txt_seeDetails);
        }
    }
}
