package com.Assignment4;

/**
 * Created by student on 3/22/16.
 */
public class BirdMovement {

    private Peacock peacock;

    public BirdMovement()
    {
        peacock = new Peacock();
    }

    public void move()
    {
        System.out.println( peacock.run());
    }
}
