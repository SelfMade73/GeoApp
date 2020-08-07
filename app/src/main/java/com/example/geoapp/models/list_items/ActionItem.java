package com.example.geoapp.models.list_items;

public class ActionItem {
    private int image;
    private String username;
    private String action;
    private String time;

    public ActionItem(int image, String username, String action, String time) {
        this.image = image;
        this.username = username;
        this.action = action;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
