package com.example.android.musify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class JazzMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Topside", "Bob James Trio"));
        songs.add(new Song("Black Dynamite", "Julian Vaughn"));
        songs.add(new Song("Stylin", "Gregory Goodloe"));
        songs.add(new Song("It's Alright", "Walter Beasley"));
        songs.add(new Song("Illuminate", "Steve Oliver"));
        songs.add(new Song("J-Factor", "Jeff Ryan"));
        songs.add(new Song("Feel Alright", "Phil Denny"));
        songs.add(new Song("Captivate Me", "Riley Richard"));
        songs.add(new Song("Say You Will", "Lebron"));
        songs.add(new Song("Drop Of Faith", "Reza Khan"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        Button navigate_now_playing = findViewById(R.id.button_1);
        navigate_now_playing.setText("Now Playing");
        navigate_now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNowPlaying = new Intent(JazzMusicActivity.this, NowPlayingActivity.class);
                startActivity(toNowPlaying);
            }
        });

        Button navigate_classical = findViewById(R.id.button_2);
        navigate_classical.setText("Classical");
        navigate_classical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toClassical = new Intent(JazzMusicActivity.this, ClassicalMusicActivity.class);
                startActivity(toClassical);
            }
        });

        Button navigate_pop = findViewById(R.id.button_3);
        navigate_pop.setText("Pop");
        navigate_pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPop = new Intent(JazzMusicActivity.this, PopMusicActivity.class);
                startActivity(toPop);
            }
        });
    }

}
