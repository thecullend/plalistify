package com.example.cdejean.playlistify;

/**
 * Created by cdejean on 1/14/18.
 */

public class header {
    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    private String content_type;

    public header(String content_type) {
        this.content_type = content_type;
    }
}
