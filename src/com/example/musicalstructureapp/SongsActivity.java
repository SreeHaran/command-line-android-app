package com.example.musicalstructureapp;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class SongsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        final ArrayList<Music> songs = new ArrayList<Music>();

        songs.add(new Music("aazhi soozhndha", "sivappu manjal pachai "));
        songs.add(new Music("idhu dhaan", "sivappu manjal pachai "));
        songs.add(new Music("zingaat", "dhadak"));
        songs.add(new Music("dhadak title track", "dhadak"));
        songs.add(new Music("The life of Ram", "96"));
        songs.add(new Music("vaa vaa penne", "uriyadi 2"));
        songs.add(new Music("osaka osaka", "vanakkam chennai"));
        songs.add(new Music("oh penne", "vanakkam chennai"));
        songs.add(new Music("ailasa ailasa", "vanakkam chennai"));


        MusicAdapter adapter = new MusicAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Music currentSong = (Music) parent.getItemAtPosition(position);

                String Song = currentSong.getmSongName();
                String Artist = currentSong.getmOrigin();

                Intent intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                intent.putExtra("Song", Song);
                intent.putExtra("Artist",Artist);
                startActivity(intent);
            }
        });
    }
}
