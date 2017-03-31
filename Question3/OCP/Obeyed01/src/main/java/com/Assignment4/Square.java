package com.Assignment4;

/**
 * Created by Ernst on 2017/03/30.
 */
public class Square extends Area {

    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide1() {
        return side;
    }

    @Override
    public double calculateArea()
    {
        return side * side;
    }
}
