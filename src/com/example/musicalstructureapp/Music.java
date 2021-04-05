package com.example.musicalstructureapp;

public class Music {
    private String mSongName;

    private String mOrigin;

    public Music(String songName, String origin){
        mSongName = songName;
        mOrigin = origin;
    }

    public String getmOrigin() { return mOrigin; }

    public String getmSongName() { return mSongName; }
}
