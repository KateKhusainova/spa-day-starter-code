package org.launchcode.spaday.models;

import java.util.Date;

public class User {
    private String username;
    private String email;
    private String password;
//    private int id;
//    private static int nextId = 1;
//    private Date joinDate;


    // Getters and Setters:
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
}
