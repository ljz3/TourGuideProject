package com.example.android.tourguideapp;

public class Location {

    private String mName;
    private String mDescription;
    private String mAddress;
    private int mImageResourceId;

    public Location(String name, String description, String address, int image) {
        mName = name;
        mDescription = description;
        mAddress = address;
        setmImageResourceId(image);
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        if (mImageResourceId != -1)
            this.mImageResourceId = mImageResourceId;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
