package com.thisis.adrianw.retrofittutorial;

import com.google.gson.annotations.SerializedName;

public class Comment {
    private int postID;
    private int id;
    private String name;
    private String email;
    @SerializedName("body")
    private String text;

    
}
