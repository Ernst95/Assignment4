package com.Assignment;

/**
 * Created by student on 3/27/16.
 */
public class User {

    private String username;
    private String password;

    public  User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    private Authentication auth = new Authentication();

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String confirmationMessage()
    {
        return auth.authenticate();
    }
}
