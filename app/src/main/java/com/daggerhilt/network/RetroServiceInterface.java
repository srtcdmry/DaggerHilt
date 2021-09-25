package com.daggerhilt.network;

import com.daggerhilt.model.RecyclerList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetroServiceInterface {

    @GET("repositories")
    Call<RecyclerList> getDataFromGitHubApi(@Query("q") String querry);
}
