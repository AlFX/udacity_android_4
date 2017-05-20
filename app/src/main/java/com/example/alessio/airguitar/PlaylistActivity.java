package com.example.alessio.airguitar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        final TextView main = (TextView) findViewById(R.id.tab_player);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        final TextView search = (TextView) findViewById(R.id.tab_search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(PlaylistActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        final TextView lyrics = (TextView) findViewById(R.id.tab_lyrics);
        lyrics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lyricsIntent = new Intent(PlaylistActivity.this, LyricsActivity.class);
                startActivity(lyricsIntent);
            }
        });

    }
}
