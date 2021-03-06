package com.Assignment4;

import com.Assignment4.AppConfig;
import com.Assignment4.Manager;
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
public class ManagerTest {

    private SalaryCalculate salaryC;

    private Manager man;

    private Employee emp;

    @Before
    public void setUp() throws Exception {
        ApplicationContext salaryCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        salaryC = (SalaryCalculate) salaryCtx.getBean("managerWages");
    }

    @Before
    public void setUpManager() throws Exception{
        ApplicationContext manCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        man = (Manager) manCtx.getBean("manager");
    }

    @Before
    public void setUpEmployee() throws Exception{
        ApplicationContext empCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        emp = (Employee)empCtx.getBean("employee");
    }

    @Test
    public void testSetJobTitle() throws Exception {
        man.setJobTitle("Manager");
        assertEquals("Manager", man.getJobTitle());
    }

    @Test
    public void testSetHourlyRate() throws Exception {
        man.setHourlyRate(3.0);
        assertEquals(3.0,man.getHourlyRate(),0);
    }

    @Test
    public void testSetHoursWorked() throws Exception {
        man.setHoursWorked(3);
        assertEquals(3,man.getHoursWorked());
    }

    @Test
    public void testGetJobTitle() throws Exception {
        man.setJobTitle("Manager");
        assertEquals("Manager",man.getJobTitle());
    }

    @Test
    public void testGetHourlyRate() throws Exception {
        man.setHourlyRate(3.0);
        assertEquals(3.0,man.getHourlyRate(),0);
    }

    @Test
    public void testGetHoursWorked() throws Exception {
        man.setHoursWorked(3);
        assertEquals(3,man.getHoursWorked());
    }

    @Test
    public void testCalculateSalary() {
        double salary = salaryC.calculateSalary(8, 35.0);
        assertEquals(280.0,salary,0);
    }

    @Test
    public void testGetEmpID() throws Exception{
        emp.setEmpID("m1");
        assertEquals("m1", emp.getEmpID());
    }

    @Test
    public void testGetName() throws Exception{
        emp.setName("Alan");
        assertEquals("Alan", emp.getName());
    }

    @Test
    public void testGetSurname() throws Exception{
        emp.setSurname("Chapman");
        assertEquals("Chapman", emp.getSurname());
    }

    @Test
    public void testToString() throws Exception {

        emp.setEmpID("m1");
        emp.setName("Alan");
        emp.setSurname("Chapman");

        man = new Manager(emp,"Manager",35.0,8);

        assertEquals("Employee ID: m1 Name: Alan Surname: Chapman Job Title: Manager Hours Worked: 8 Hourly Rate: 35.0",man.toString());
    }

    @After
    public void tearDown() throws Exception {

    }
}