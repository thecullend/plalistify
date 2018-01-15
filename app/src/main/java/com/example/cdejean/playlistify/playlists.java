package com.example.cdejean.playlistify;

import java.util.List;

/**
 * Created by cdejean on 1/12/18.
 */

public class playlists {
    tracks tracks;
    private String image;
    private String name;




    public playlists(tracks tracks, String image, String name) {

        this.tracks = tracks;
        this.image = image;
        this.name = name;
    }


    public void setImage(String image) {
        this.image = image;
    }

    public com.example.cdejean.playlistify.tracks getTracks() {
        return tracks;
    }

    public void setTracks(com.example.cdejean.playlistify.tracks tracks) {
        this.tracks = tracks;
    }

    public String getImage() {
        return image;
    }

    public String getPlaylistname() {
        return name;
    }

    @Override
    public String toString() {
        return "playlists{"  +
                ", name='" + name + '\'' +
                '}';
    }
}
