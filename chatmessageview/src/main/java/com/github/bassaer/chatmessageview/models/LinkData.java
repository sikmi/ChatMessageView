package com.github.bassaer.chatmessageview.models;

import android.graphics.Bitmap;

/**
 * Created by totty on 2017/05/26.
 */

public class LinkData {
    private String mUrl;
    private String mTitle;
    private String mDescription;
    private Bitmap mIcon;

    public LinkData(String url, String title, String description, Bitmap icon) {
        mUrl = url;
        mTitle = title;
        mDescription = description;
        mIcon = icon;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Bitmap getIcon() {
        return mIcon;
    }

    public void setIcon(Bitmap icon) {
        mIcon = icon;
    }
}
