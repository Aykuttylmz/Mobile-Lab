package com.example.week12;


import com.google.firebase.Timestamp;
import com.google.firebase.database.Exclude;
public class Note {
    @Exclude
    private String id;
    private Timestamp date;
    private String content;

}
