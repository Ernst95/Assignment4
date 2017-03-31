package com.Assignment4;

/**
 * Created by Ernst on 2017/03/30.
 */
public class Rectangle extends Shape{

    private double length;
    private double breadth;

    public Rectangle() {

    }

    public Rectangle(double length, double breadth) {
        super();
        this.breadth = breadth;
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

}
