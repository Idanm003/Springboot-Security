package com.userLogin.userLogin.model;

public class CustomerUser {
    private Long id;
    private String username;
    private String password;
    private int active;
    private String roles;
    private String permissions;

    public CustomerUser(Long id, String username, String password, int active, String roles, String permissions) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.roles = roles;
        this.permissions = permissions;
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getActive() {
        return this.active;
    }
    public void setActive(int active) {
        this.active = active;
    }

    public String getRoles() {
        return this.roles;
    }
    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getPermissions() {
        return this.permissions;
    }
    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
}
