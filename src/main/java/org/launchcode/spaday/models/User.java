package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {

    @NotBlank(message = "Name is required")
    @NotNull
    @Size(min = 5, max = 15, message = "Username must be between 5 ant 15 characters")
    private String username;

    @Email(message = "Email must be in the format of a valid email address")
    private String email;

    @NotBlank(message = "Password is required")
    @NotNull
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;


    public User() {}

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

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

    //Bonus:
//    @NotNull(message = "Passwords do not match")
//    private String verifyPassword;
//
//    public String getVerifyPassword() {
//        return verifyPassword;
//    }
//
//    public void setVerifyPassword(String verifyPassword) {
//        this.verifyPassword = verifyPassword;
//        this.checkPassword();
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//        this.checkPassword();
//    }
//
//    private void checkPassword () {
//        if(this.password != null & this.verifyPassword != null & this.password.equals(this.verifyPassword)) {
//            this.verifyPassword = null;
//        }
//    }

}
