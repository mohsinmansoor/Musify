package com.example.android.musify;

public class Song {
    private String mSongName;
    private String mArtistName;

    public Song (String SongName, String ArtistName) {
        mSongName = SongName;
        mArtistName = ArtistName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }
}
