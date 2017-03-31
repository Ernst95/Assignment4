package com.Assignment4;

/**
 * Created by Ernst on 2017/03/30.
 */
public class User {

    private String username;
    private String password;

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
