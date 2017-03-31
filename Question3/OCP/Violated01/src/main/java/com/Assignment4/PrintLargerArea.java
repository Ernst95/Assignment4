package com.Assignment4;

/**
 * Created by Ernst on 2017/03/30.
 */
public class PrintLargerArea {

    private Square square  ;
    private Rectangle rectangle;

    private double squareArea;
    private double rectangleArea;

    public PrintLargerArea(Square square, Rectangle rectangle)
    {
        this.square = square;
        this.rectangle = rectangle;
    }

    public void printLargerArea()
    {
        squareArea = (square.getSide1() * square.getSide1());

        rectangleArea = (rectangle.getLength() * rectangle.getBreadth());

        if (squareArea > rectangleArea)
            printSquare();
        else
            printRectangle();
    }

    public void printSquare()
    {
        System.out.println("Square is larger");
    }

    public void printRectangle()
    {
        System.out.println("Rectangle is larger");
    }

}
