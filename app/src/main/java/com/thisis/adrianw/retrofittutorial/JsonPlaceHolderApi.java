package com.thisis.adrianw.retrofittutorial;

import java.util.List;
import retrofit2.Call;

public interface JsonPlaceHolderApi {
    Call<List<Post>> getPosts();
}
