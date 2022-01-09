package com.example.pinterest;

public class Upload {
    private String mTieude, mMota;
    private String mImageUrl;

    public Upload(){}
    public Upload(String Tieude, String Mota, String imageUrl) {
        mTieude = Tieude;
        mMota = Mota;
        mImageUrl = imageUrl;

    }
    public Upload(String Tieude, String imageUrl) {
        mTieude = Tieude;
        mImageUrl = imageUrl;

    }

    public String getTieude() {
        return mTieude;
    }

    public void setTieude(String name) {
        mTieude = name;
    }

    public String getMota() {
        return mMota;
    }

    public void setMota(String mMota) {
        this.mMota = mMota;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
}
