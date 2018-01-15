package com.example.cdejean.playlistify;

/**
 * Created by cdejean on 1/13/18.
 */

public class song {
     private String name;
     private String artist;


    public song(String name, String artist){
        this.name = name;
        this.artist = artist;

    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
