package com.flyco.tablayoutsamples.utils

import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.flyco.tablayout.v3.IImageLoader

/**
 *
 * <b>@author：</b> shetj<br>
 * <b>@createTime：</b> 2024/4/23<br>
 * <b>@email：</b> 375105540@qq.com<br>
 * <b>@describe</b>  <br>
 */
class SimpleImageLoader: IImageLoader {
    override fun loadImage(imageView: ImageView, url: Any) {
        Log.i("SimpleImageLoader", "imageView:${imageView},loadImage: $url")
        Glide.with(imageView.context)
            .load(url)
            .centerInside()
            .into(imageView)
    }
}