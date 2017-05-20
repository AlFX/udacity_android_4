package com.example.alessio.airguitar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LyricsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);

        final TextView playlist = (TextView) findViewById(R.id.tab_playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(LyricsActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        final TextView search = (TextView) findViewById(R.id.tab_search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(LyricsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        final TextView player = (TextView) findViewById(R.id.tab_player);
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(LyricsActivity.this, MainActivity.class);
                startActivity(playerIntent);
            }
        });


    }
}
