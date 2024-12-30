package com.example.codingapp;

public class LoginRequest {
    private String email;
    private String password;

    public LoginRequest(String username, String password) {
        this.email = username;
        this.password = password;
    }

    public String getUsername() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
