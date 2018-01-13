package com.example.cdejean.playlistify;


import java.util.List;

import retrofit2.http.POST;
import retrofit2.Call;
/**
 * Created by cdejean on 1/12/18.
 */

public interface Api {

    String BASE_URL = "https://l9oxifrg07.execute-api.us-east-1.amazonaws.com/";

    @POST("Test")
    Call <List<playlists>> getLists();
//<List>
}
