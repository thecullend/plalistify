package com.example.cdejean.playlistify;

import java.util.List;

/**
 * Created by cdejean on 1/13/18.
 */

public class music {
    // @SerializedName("headers")
    header headers;
    private String content_type;
    private List<playlists> playlists;
    private String statusCode;

    public music(header headers, List<playlists> playlists, String statusCode, String content_type) {
        this.headers = headers;
        this.playlists = playlists;
        this.statusCode = statusCode;
        this.content_type = content_type;
    }

    public List<playlists> getPlaylists() {
        return playlists;
    }

    public void setHeaders(header headers) {
        this.headers = headers;
    }

    public String getStatusCode() {
        return statusCode;
    }



}


