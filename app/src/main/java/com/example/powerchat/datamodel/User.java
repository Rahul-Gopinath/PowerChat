package com.example.powerchat.datamodel;

public class User {

    private String name;
    private String userId;
    private String username;
    private String imageUrl;

    public User(String name, String userId, String username, String imageUrl) {
        this.name = name;
        this.userId = userId;
        this.username = username;
        this.imageUrl = imageUrl;
    }

    public User(){

    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
