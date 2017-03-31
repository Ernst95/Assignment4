package com.Assignment4;

import com.Assignment4.AppConfig;
import com.Assignment4.Cashier;
import com.Assignment4.SalaryCalculate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ernst on 2017/03/28.
 */
public class CashierTest {

    private SalaryCalculate salaryC;

    private Cashier cashier;

    private Employee employee;

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

    @Before
    public void setUpEmployee()throws Exception{
        ApplicationContext employeeCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        employee = (Employee) employeeCtx.getBean("employee");
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
    public void testGetEmpID() throws Exception{
        employee.setEmpID("c1");
        assertEquals("c1", employee.getEmpID());
    }

    @Test
    public void testGetName() throws Exception{
        employee.setName("Ernst");
        assertEquals("Ernst", employee.getName());
    }

    @Test
    public void testGetSurname() throws Exception{
        employee.setSurname("Chapman");
        assertEquals("Chapman", employee.getSurname());
    }

    @Test
    public void testToString() throws Exception {

        employee.setEmpID("c1");
        employee.setName("Ernst");
        employee.setSurname("Chapman");

        cashier = new Cashier(employee,"Cashier",19.0,8);

        assertEquals("Employee ID: c1 Name: Ernst Surname: Chapman Job Title: Cashier Hours Worked: 8 Hourly Rate: 19.0",cashier.toString());
    }

    @After
    public void tearDown() throws Exception {

    }
}