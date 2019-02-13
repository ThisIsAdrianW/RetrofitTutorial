package com.thisis.adrianw.retrofittutorial;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Post>> getPosts(@Query("userId") int id,
                              @Query("_sort") String sort,
                              @Query("_order") String order
    );

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);
}
