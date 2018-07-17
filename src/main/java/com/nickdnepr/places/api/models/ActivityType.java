package com.nickdnepr.places.api.models;

public class ActivityType {

    private long id;
    private String title;

    public ActivityType(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
