package com.Assgnment4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Peacock peacock = new Peacock();
        Pidgeon pidgeon = new Pidgeon();

        BirdMovement movement = new BirdMovement(peacock);
        BirdMovement movement1 = new BirdMovement(pidgeon);

        movement.getMovement();
        movement1.getMovement();

    }
}
