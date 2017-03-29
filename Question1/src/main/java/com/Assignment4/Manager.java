package com.Assignment4;

/**
 * Created by Ernst on 2017/03/28.
 */
public class Manager extends Employee implements SalaryCalculate{

    private String jobTitle;
    private double hourlyRate;
    private int hoursWorked;

    public Manager()
    {

    }

    public Manager(String empID, String name, String surname, String jobTitle, double hourlyRate, int hoursWorked)
    {
        super(empID, name, surname);
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

    public String toString()
    {
        return super.toString() + "\tJob Title: " + jobTitle + "\tHours Worked: " + "\tHourly Rate: " + hourlyRate;
    }
}
