package com.example.android.musify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicalMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Eine kleine Nachtmusik", "Mozart"));
        songs.add(new Song("Für Elise", "Beethoven"));
        songs.add(new Song("O mio babbino caro", "Puccini"));
        songs.add(new Song("Toccata and Fugue in D minor", "J.S. Bach"));
        songs.add(new Song("The Four Seasons", "Vivaldi"));
        songs.add(new Song("Carmen", "Bizet"));
        songs.add(new Song("The Blue Danube", "Johann Strauss II "));
        songs.add(new Song("Boléro", "Ravel"));
        songs.add(new Song("Flower Duet", "Delibes"));
        songs.add(new Song("Dance of the Knights", "Prokofiev"));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        Button navigate_now_playing = findViewById(R.id.button_1);
        navigate_now_playing.setText("Now Playing");
        navigate_now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNowPlaying = new Intent(ClassicalMusicActivity.this, NowPlayingActivity.class);
                startActivity(toNowPlaying);
            }
        });

        Button navigate_pop = findViewById(R.id.button_2);
        navigate_pop.setText("Pop");
        navigate_pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPop = new Intent(ClassicalMusicActivity.this, PopMusicActivity.class);
                startActivity(toPop);
            }
        });

        Button navigate_jazz = findViewById(R.id.button_3);
        navigate_jazz.setText("Jazz");
        navigate_jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toJazz = new Intent(ClassicalMusicActivity.this, JazzMusicActivity.class);
                startActivity(toJazz);
            }
        });

    }
}
