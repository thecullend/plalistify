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



    public String getImage() {
        return image;
    }

    public String getPlaylistname() {
        return name;
    }
}
