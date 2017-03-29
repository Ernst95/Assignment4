package com.Assignment4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        int hoursWorked = 8;

        Cashier cashier = new Cashier("c1", "Ernst", "Chapman", "Cashier",19 ,0 );
        Manager manager = new Manager("m1","Alan","Chapman","Manager",35,0);

        System.out.println(cashier.toString() + "\tSalary: " + cashier.calculateSalary(hoursWorked, cashier.getHourlyRate()));

        System.out.println(manager.toString() + "\tSalary: " + manager.calculateSalary(hoursWorked, manager.getHourlyRate()));
    }
}
