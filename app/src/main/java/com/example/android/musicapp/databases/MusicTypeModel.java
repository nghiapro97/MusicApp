package com.example.android.musicapp.databases;

/**
 * Created by valky on 7/19/2017.
 */

public class MusicTypeModel {
    private String id;
    private String key;
    private int imageID;

    public MusicTypeModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
