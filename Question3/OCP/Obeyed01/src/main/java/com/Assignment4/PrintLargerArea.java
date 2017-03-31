package com.Assignment4;

/**
 * Created by Ernst on 2017/03/30.
 */
public class PrintLargerArea {

    public PrintLargerArea(){}

    public void printLargerArea(double result, double result2)
    {
       if(result > result2)
       {
           System.out.println("Rectangle is larger");
       }
       else if(result < result2)
       {
           System.out.println("Square area is bigger");
       }
       else
       {
           System.out.println("Both are equal");
       }
    }
}
