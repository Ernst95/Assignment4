package com.Assignment4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Employee empCash = new Employee("c1","Ernst","Chapman");
        Employee empMan = new Employee("m1","Alan","Chapman");


        Cashier cashier = new Cashier(empCash, "Cashier",19 ,8 );
        Manager manager = new Manager(empMan,"Manager",35,8);

        System.out.println(cashier.toString() + "\tSalary: " + cashier.calculateSalary(cashier.getHoursWorked(), cashier.getHourlyRate()));

        System.out.println(manager.toString() + "\tSalary: " + manager.calculateSalary(manager.getHoursWorked(), manager.getHourlyRate()));
    }
}
