package com.example.cdejean.playlistify;

import java.util.List;

/**
 * Created by cdejean on 1/12/18.
 */

public class playlists {
    private String headers;
    private String content_type;
    private String playlists;
    private String tracks;
    private String total;
    private String songs;
    private String trackname;
    private String artist;
    private String image;
    private String name;
    private String statusCode;



    public playlists(String headers, String content_type, String playlists, String tracks, String total, String songs,
                     String trackname, String artist, String image, String playlistname, String statusCode) {
        this.headers = headers;
        this.content_type = content_type;
        this.playlists = playlists;
        this.tracks = tracks;
        this.total = total;
        this.songs = songs;
        this.trackname = trackname;
        this.artist = artist;
        this.image = image;
        this.name = playlistname;
        this.statusCode = statusCode;
    }


    public String getPlaylists() {
        return playlists;
    }

    public String getTracks() {
        return tracks;
    }

    public String getTotal() {
        return total;
    }

    public String getSongs() {return songs;}

    public String getTrackname() {
        return trackname;
    }

    public String getArtist() {
        return artist;
    }

    public String getImage() {
        return image;
    }

    public String getPlaylistname() {
        return name;
    }
}
