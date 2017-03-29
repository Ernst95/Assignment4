package com.Assignment4;

/**
 * Created by Ernst on 2017/03/28.
 */
public class Employee {

    private String empID;
    private String name;
    private String surname;

    public Employee()
    {

    }

    public Employee(String empID, String name, String surname)
    {
        this.empID = empID;
        this.name = name;
        this.surname = surname;
    }

    public void setEmpID(String empID)
    {
        this.empID = empID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getEmpID()
    {
        return empID;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String toString()
    {
        return "Employee ID: " + empID + " Name: " + name + " Surname: " + surname;
    }
}
