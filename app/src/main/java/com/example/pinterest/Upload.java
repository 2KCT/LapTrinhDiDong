package com.example.pinterest;

public class Upload {
    private String mId,mTieude, mMota, mFileExtension;
    private String mImageUrl;

    public Upload(){}
    public Upload(String id, String Tieude, String Mota, String imageUrl,String fileExtension) {
        mId = id;
        mTieude = Tieude;
        mMota = Mota;
        mImageUrl = imageUrl;
        mFileExtension = fileExtension;
    }
    public Upload(String Tieude, String imageUrl) {
        mTieude = Tieude;
        mImageUrl = imageUrl;

    }



    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
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
    public String getFileExtension() {
        return mFileExtension;
    }

    public void setFileExtension(String FileExtension) {
        this.mFileExtension = FileExtension;
    }
}
