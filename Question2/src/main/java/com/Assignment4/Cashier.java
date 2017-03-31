package com.Assignment4;

/**
 * Created by Ernst on 2017/03/28.
 */
public class Cashier implements SalaryCalculate {

    private String jobTitle;
    private double hourlyRate;
    private int hoursWorked;

    Employee emp;

    public Cashier()
    {

    }

    public Cashier(Employee emp, String jobTitle, double hourlyRate, int hoursWorked)
    {
       this.emp = emp;
        this.jobTitle = jobTitle;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }

    public void setHourlyRate(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }

    public double getHourlyRate()
    {
        return hourlyRate;
    }

    public int getHoursWorked()
    {
        return hoursWorked;
    }

    public double calculateSalary(int hWorked, double hRate)
    {
        return hWorked * hRate;
    }

    public String getEmpID()
    {
        return emp.getEmpID();
    }

    public String getName()
    {
        return emp.getName();
    }

    public String getSurname()
    {
        return emp.getSurname();
    }

    public String toString()
    {
        return emp.toString() + " Job Title: " + jobTitle + " Hours Worked: " + hoursWorked + " Hourly Rate: " + hourlyRate;
    }

}
