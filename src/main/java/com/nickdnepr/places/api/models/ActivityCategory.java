package com.nickdnepr.places.api.models;

import java.util.List;

public class ActivityCategory {

    private long id;
    private String title;
    private List<ActivityType> types;

    public ActivityCategory(long id, String title, List<ActivityType> types) {
        this.id = id;
        this.title = title;
        this.types = types;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<ActivityType> getTypes() {
        return types;
    }
}
