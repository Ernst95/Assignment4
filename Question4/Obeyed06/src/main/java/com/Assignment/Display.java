package com.Assignment;

/**
 * Created by student on 3/27/16.
 */
public class Display {

private  Authentication auth;

    public Display()
    {
        auth = new Authentication();
    }

    public void confirmationMessage()
    {
        System.out.println(auth.authenticate());
    }
}
