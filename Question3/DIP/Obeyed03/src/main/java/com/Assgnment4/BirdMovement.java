package com.Assgnment4;

/**
 * Created by Ernst on 2017/03/30.
 */
public class BirdMovement {

   private MovementService movement;

    public BirdMovement(MovementService movement)
    {
        this.movement = movement;
    }

    public void getMovement()
    {
       System.out.println( movement.move());
    }
}
