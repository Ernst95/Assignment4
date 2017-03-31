package com.Assignment4;

/**
 * Created by Ernst on 2017/03/30.
 */
public class Area {

    private double side;

    public Area()
    {

    }

    public Area(double side)
    {
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    public double calculateArea()
    {
        return side * side;
    }

    public String printResults()
    {
        return "The Area is: " + calculateArea();
    }

}
