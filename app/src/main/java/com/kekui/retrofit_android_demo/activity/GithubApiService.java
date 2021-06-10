package com.kekui.retrofit_android_demo.activity;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface GithubApiService {
    @GET("search/commits")
    Call<ResponseBean> getReposCommits(
            @Header("Accept") String authorization,
            @Query("q") String para);
}