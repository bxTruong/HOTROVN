package com.example.hotrovn.Utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImgHandling {
    public void glideImg(ImageView img, Context context, int drawable) {
        Glide.with(context)
                .load(drawable)
                .into(img);
    }
}
