package com.Assignment4;

/**
 * Created by Ernst on 2017/03/30.
 */
public class Square {

    Area area;

    public Square() {
        area = new Area(10.0);
    }

    public double getSide() {
        return area.getSide();
    }

    public double getArea() {
        return area.calculateArea();
    }

    public String displayArea()
    {
        return area.printResults();
    }
}
