package com.Assignment4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/03/28.
 */
public class EmployeeTest {

    private Employee emp;

    @Before
    public void setUpEmployee(){
        ApplicationContext empCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        emp = (Employee)empCtx.getBean("employee");
    }

    @Test
    public void testSetEmpID() throws Exception{
        emp.setEmpID("m1");
        assertEquals("m1", emp.getEmpID());
    }

    @Test
    public void testSetName() throws Exception{
        emp.setName("Ernst");
        assertEquals("Ernst", emp.getName());
    }

    @Test
    public void testSetSurname() throws Exception{
        emp.setSurname("Chapman");
        assertEquals("Chapman", emp.getSurname());
    }

    @Test
    public void testGetEmpID() throws Exception{
        emp.setEmpID("m1");
        assertEquals("m1", emp.getEmpID());
    }

    @Test
    public void testGetName() throws Exception{
        emp.setName("Ernst");
        assertEquals("Ernst", emp.getName());
    }

    @Test
    public void testGetSurname() throws Exception{
        emp.setSurname("Chapman");
        assertEquals("Chapman", emp.getSurname());
    }

    @Test
    public void testToString() throws Exception{
        emp.setEmpID("m1");
        emp.setName("Ernst");
        emp.setSurname("Chapman");

        assertEquals("Employee ID: m1 Name: Ernst Surname: Chapman", emp.toString());
    }


}