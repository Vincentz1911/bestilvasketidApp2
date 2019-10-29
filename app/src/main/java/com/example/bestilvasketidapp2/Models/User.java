package com.example.bestilvasketidapp2.Models;

import java.util.Date;

public class User {

    public User(String email, String password){
        Email = email;
        Password = password;
    }

    public User(int id, String name, String phone, String email, String password, Date lastLogin, int timestamp) {
        Id = id;
        Name = name;
        Phone = phone;
        Email = email;
        Password = password;
        LastLogin = lastLogin;
        Timestamp = timestamp;
    }

    private int Id ;
    private String Name;
    private String Phone;
    private String Email;
    private String Password;
    private Date LastLogin;
    private int Timestamp ;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getLastLogin() {
        return LastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        LastLogin = lastLogin;
    }

    public int getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(int timestamp) {
        Timestamp = timestamp;
    }


}

