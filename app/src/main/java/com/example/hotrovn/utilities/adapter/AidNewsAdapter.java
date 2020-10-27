package com.example.hotrovn.utilities.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hotrovn.R;
import com.example.hotrovn.activity.needRelief.AidInformation;
import com.example.hotrovn.model.ObjectAidNews;

import java.util.ArrayList;

public class AidNewsAdapter extends RecyclerView.Adapter<AidNewsAdapter.ViewHolder> {
    ArrayList<ObjectAidNews> objectAidNews;
    Context context;

    public AidNewsAdapter(ArrayList<ObjectAidNews> objectAidNews, Context context) {
        this.objectAidNews = objectAidNews;
        this.context = context;
    }

    @NonNull
    @Override
    public AidNewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_aid_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AidNewsAdapter.ViewHolder holder, int position) {
        Glide.with(context)
                .load(objectAidNews.get(position).getImgLocation())
                .into(holder.mImgLocation);
        holder.mTxtLocation.setText(objectAidNews.get(position).getTxtLocation());

        Glide.with(context)
                .load(objectAidNews.get(position).getImgDistributed())
                .into(holder.mImgDistributed);
        holder.mTxtDistraibuted.setText(objectAidNews.get(position).getTxtDistraibuted());

        Glide.with(context)
                .load(objectAidNews.get(position).getImgDeliveryCart())
                .into(holder.mImgDeliveryCart);
        holder.mTxtNumberReliefCampaign.setText(objectAidNews.get(position).getTxtNumberReliefCampaign());

        holder.mTxtDate.setText(objectAidNews.get(position).getTxtDate());

        holder.mTxtSeeDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, AidInformation.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return objectAidNews.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImgLocation;
        private TextView mTxtLocation;
        private ImageView mImgDistributed;
        private TextView mTxtDistraibuted;
        private ImageView mImgDeliveryCart;
        private TextView mTxtNumberReliefCampaign;
        private TextView mTxtDate;
        private TextView mTxtSeeDetails;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mImgLocation = itemView.findViewById(R.id.img_location);
            mTxtLocation = itemView.findViewById(R.id.txt_location);
            mImgDistributed = itemView.findViewById(R.id.img_distributed);
            mTxtDistraibuted = itemView.findViewById(R.id.txt_distraibuted);
            mImgDeliveryCart = itemView.findViewById(R.id.img_deliveryCart);
            mTxtNumberReliefCampaign = itemView.findViewById(R.id.txt_numberReliefCampaign);
            mTxtDate = itemView.findViewById(R.id.txt_date);
            mTxtSeeDetails = itemView.findViewById(R.id.txt_seeDetails);
        }
    }
}
