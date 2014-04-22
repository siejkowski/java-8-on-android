package net.siejkowski.lambdandroid.retro;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

public interface GitHubService {
    @GET("/users/{user}/repos")
    void listRepos(@Path("user") String user, Callback<List<String>> back);

    @GET("/users/{user}/repos")
    Observable<List<String>> listReps(@Path("user") String user);

}