package com.Assignment4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Square s = new Square(10.0);
        Rectangle r = new Rectangle(10.0,55.0);

        PrintLargerArea printLA = new PrintLargerArea();

        printLA.printLargerArea(r.calculateArea(), s.calculateArea());
    }
}
