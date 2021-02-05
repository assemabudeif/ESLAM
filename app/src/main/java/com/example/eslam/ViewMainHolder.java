package com.example.eslam;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewMainHolder {
    TextView txtItemName;
    ImageView imgListImage;
    View main_list;

    public ViewMainHolder(View view) {
        main_list = view;
    }

    public ImageView getImgListImage() {
        if (imgListImage == null)
            imgListImage = main_list.findViewById(R.id.imgListImage);

        return imgListImage;
    }

    public TextView getTxtItemName() {
        if (txtItemName == null)
            txtItemName = main_list.findViewById(R.id.txtItemName);

        return txtItemName;
    }
}
