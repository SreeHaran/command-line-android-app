package com.example.musicalstructureapp;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NowPlayingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Intent i = getIntent();

        TextView nowPlayingSongText = (TextView) findViewById(R.id.now_playing_song);
        String nowPlayingSong = i.getStringExtra("Song");
        nowPlayingSongText.setText(nowPlayingSong);

        TextView nowPlayingArtistText = (TextView) findViewById(R.id.now_playing_artist);
        String nowPlayingArtist = i.getStringExtra("Artist");
        nowPlayingArtistText.setText(nowPlayingArtist);
    }
}
