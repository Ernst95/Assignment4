package com.Assignment4;

/**
 * Created by Ernst on 2017/03/30.
 */
public class Square extends Shape{

    private double side;

    public Square(double side)
    {
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    @Override
    public double calculateArea()
    {
        return side * side;
    }
}
