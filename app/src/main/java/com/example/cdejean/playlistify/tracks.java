package com.example.cdejean.playlistify;

import java.util.List;

/**
 * Created by cdejean on 1/14/18.
 */

public class tracks {
    private int total;
    List<song> songs;


    public tracks(int total, List<song> songs){
        this.total = total;
        this.songs = songs;
    }

    public int getTotal() {
        return total;
    }

    public List<song> getSongs() {
        return songs;
    }
}
