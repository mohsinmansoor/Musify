package com.example.android.musify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button navigate_classical = findViewById(R.id.navigate_classical);
        navigate_classical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toClassical = new Intent(NowPlayingActivity.this, ClassicalMusicActivity.class);
                startActivity(toClassical);
            }
        });

        Button navigate_pop = findViewById(R.id.navigate_pop);
        navigate_pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPop = new Intent(NowPlayingActivity.this, PopMusicActivity.class);
                startActivity(toPop);
            }
        });

        Button navigate_jazz = findViewById(R.id.navigate_jazz);
        navigate_jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toJazz = new Intent(NowPlayingActivity.this, JazzMusicActivity.class);
                startActivity(toJazz);
            }
        });

    }
}