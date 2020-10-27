package com.example.hotrovn.utilities;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImgHandling {
    public void glideImg(ImageView img, Context context, int drawable) {
        Glide.with(context)
                .load(drawable)
                .into(img);
    }
}
