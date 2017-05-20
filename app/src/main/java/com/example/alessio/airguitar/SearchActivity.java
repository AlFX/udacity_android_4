package com.example.alessio.airguitar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        final TextView main = (TextView) findViewById(R.id.tab_player);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        final TextView playlist = (TextView) findViewById(R.id.tab_playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(SearchActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        final TextView lyrics = (TextView) findViewById(R.id.tab_lyrics);
        lyrics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lyricsIntent = new Intent(SearchActivity.this, LyricsActivity.class);
                startActivity(lyricsIntent);
            }
        });

    }
}
