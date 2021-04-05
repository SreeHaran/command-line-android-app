package com.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import android.app.Activity;

import java.util.ArrayList;

public class InstrumentActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrument);

        final ArrayList<Music> songs = new ArrayList<Music>();

        songs.add(new Music("Guitar",""));
        songs.add(new Music("Harp",""));
        songs.add(new Music("Piano",""));
        songs.add(new Music("Trumpet",""));
        songs.add(new Music("Drums",""));
        songs.add(new Music("Bell",""));
        songs.add(new Music("Xylophone",""));
        songs.add(new Music("Violin",""));
        songs.add(new Music("Flute",""));

        MusicAdapter adapter = new MusicAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Music currentSong = (Music) parent.getItemAtPosition(position);

                String Song = currentSong.getmSongName();

                Intent intent = new Intent(InstrumentActivity.this, NowPlayingActivity.class);
                intent.putExtra("Song", Song);
                startActivity(intent);
            }
        });
    }
}
