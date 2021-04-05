package com.example.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MusicAdapter extends ArrayAdapter<Music> {


    public MusicAdapter(Context context, ArrayList<Music> songs) {
        super(context,0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Music currentSong = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        nameTextView.setText(currentSong.getmSongName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        numberTextView.setText(currentSong.getmOrigin());

        return listItemView;
    }
}
