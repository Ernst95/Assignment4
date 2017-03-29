package com.Assignment4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ernst on 2017/03/28.
 */
public class CashierTest {

    private SalaryCalculate salaryC;

    private Cashier cashier;

    @Before
    public void setUp() throws Exception {
        ApplicationContext salaryCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        salaryC = (SalaryCalculate) salaryCtx.getBean("cashierWages");
    }

    @Before
    public void setUpCashier() throws Exception{
        ApplicationContext cashierCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        cashier = (Cashier) cashierCtx.getBean("cashier");
    }

    @Test
    public void testSetJobTitle() throws Exception {
        cashier.setJobTitle("Cashier");
        assertEquals("Cashier", cashier.getJobTitle());
    }

    @Test
    public void testSetHourlyRate() throws Exception {
        cashier.setHourlyRate(3.0);
        assertEquals(3.0,cashier.getHourlyRate(),0);
    }

    @Test
    public void testSetHoursWorked() throws Exception {
        cashier.setHoursWorked(3);
        assertEquals(3,cashier.getHoursWorked());
    }

    @Test
    public void testGetJobTitle() throws Exception {
        cashier.setJobTitle("Cashier");
        assertEquals("Cashier",cashier.getJobTitle());
    }

    @Test
    public void testGetHourlyRate() throws Exception {
        cashier.setHourlyRate(3.0);
        assertEquals(3.0,cashier.getHourlyRate(),0);
    }

    @Test
    public void testGetHoursWorked() throws Exception {
        cashier.setHoursWorked(3);
        assertEquals(3,cashier.getHoursWorked());
    }

    @Test
    public void testCalculateSalary() {
        double salary = salaryC.calculateSalary(8, 20);
        assertEquals(160,salary,0);
    }

    @Test
    public void testToString() throws Exception {

        cashier = new Cashier("c1","Ernst","Chapman","Cashier",19.0,8);

        assertEquals("Employee ID: c1 Name: Ernst Surname: Chapman Job Title: Cashier Hours Worked: 8 Hourly Rate: 19.0",cashier.toString());
    }

    @After
    public void tearDown() throws Exception {

    }
}