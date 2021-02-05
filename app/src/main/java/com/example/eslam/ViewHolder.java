package com.example.eslam;

import android.view.View;
import android.widget.ImageView;

public class ViewHolder {
    ImageView imgPage;
    View row;
    public ViewHolder(View view){
        row = view;
    }
    public ImageView getImgPage(){
        if (imgPage == null)
            imgPage = row.findViewById(R.id.imgPage);
        return imgPage;
    }
}
