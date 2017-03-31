package com.Assignment4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Square s = new Square();

        PrintArea printA = new PrintArea();

        printA.printArea(s.getArea());
    }
}
