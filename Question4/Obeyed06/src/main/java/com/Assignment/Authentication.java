package com.Assignment;

/**
 * Created by student on 3/27/16.
 */
public class Authentication {

    private User user;

    public Authentication(){
        user = new User("Ernst", "1234");
    }



    public String authenticate()
    {
        if (user.getUsername()== "Ernst" && user.getPassword() == "1234")
            return "Log In Successful...";
        else
            return "Log In Failed";
    }
}
