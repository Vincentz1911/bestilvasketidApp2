package com.example.bestilvasketidapp2.Models;

public class DTO_User {

    public DTO_User(User user, TimeStamp timeStamp) {
        this.user = user;
        this.timeStamp = timeStamp;
    }

    private User user;
    private TimeStamp timeStamp;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TimeStamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(TimeStamp timeStamp) {
        this.timeStamp = timeStamp;
    }
}
