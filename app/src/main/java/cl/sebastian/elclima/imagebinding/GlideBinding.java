package cl.sebastian.elclima.imagebinding;

import android.content.Context;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import cl.sebastian.elclima.R;


public class GlideBinding {
    @BindingAdapter("imageResource")
    public static void setImageResorce(ImageView imgView, int imgURL) {
        Context context = imgView.getContext();

        RequestOptions option = new RequestOptions()
                //.placeholder(R.drawable.ic_sky_cloud.error(R.drawable.ic_sky_cloud);
                .placeholder(R.drawable.ic_sky_cloud)
                .error(R.drawable.ic_sky_cloud);

        Glide.with(context)
                .setDefaultRequestOptions(option)
                .load(imgURL)
                .into(imgView);
    }
}
