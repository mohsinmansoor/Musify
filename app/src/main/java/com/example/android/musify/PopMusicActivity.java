package com.example.android.musify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class PopMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);


        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Talk", "Khalid"));
        songs.add(new Song("Sucker", "Jonas Brothers"));
        songs.add(new Song("Bad Guy", "Billie Eilish"));
        songs.add(new Song("Wow.", "Post Malone"));
        songs.add(new Song("If I Can't Have You", "Shawn Mendes"));
        songs.add(new Song("Old Town Road", "Lil Nas X "));
        songs.add(new Song("Never Really Over", "Katy Perry"));
        songs.add(new Song("You Need To Calm Down", "Taylor Swift"));
        songs.add(new Song("Nightmare", "Halsey"));
        songs.add(new Song("Truth Hurts", "Lizzo"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        Button navigate_now_playing = findViewById(R.id.button_1);
        navigate_now_playing.setText("Now Playing");
        navigate_now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNowPlaying = new Intent(PopMusicActivity.this, NowPlayingActivity.class);
                startActivity(toNowPlaying);
            }
        });

        Button navigate_classical = findViewById(R.id.button_2);
        navigate_classical.setText("Classical");
        navigate_classical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toClassical = new Intent(PopMusicActivity.this, ClassicalMusicActivity.class);
                startActivity(toClassical);
            }
        });

        Button navigate_jazz = findViewById(R.id.button_3);
        navigate_jazz.setText("Jazz");
        navigate_jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toJazz = new Intent(PopMusicActivity.this, JazzMusicActivity.class);
                startActivity(toJazz);
            }
        });
    }
}
