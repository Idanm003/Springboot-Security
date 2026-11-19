package com.userLogin.userLogin.security.model;

public class AuthenticationRequest {
    private String Username;
    private String Password;

    public AuthenticationRequest(String username, String password) {
        Username = username;
        Password = password;
    }

    public String getUsername() {
        return this.Username;
    }
    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return this.Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
}
