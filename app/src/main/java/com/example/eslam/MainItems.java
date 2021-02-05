package com.example.eslam;

public class MainItems {
    private String txtItemName;
    private int imgListImage;

    public MainItems(String txtItemName, int imgListImage) {
        this.txtItemName = txtItemName;
        this.imgListImage = imgListImage;
    }

    public String getTxtItemName() {
        return txtItemName;
    }

    public void setTxtItemName(String txtItemName) {
        this.txtItemName = txtItemName;
    }

    public int getImgListImage() {
        return imgListImage;
    }

    public void setImgListImage(int imgListImage) {
        this.imgListImage = imgListImage;
    }

    @Override
    public String toString() {
        return txtItemName;
    }
}
