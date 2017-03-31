package com.Assignment4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/03/31.
 */
public class DisplayTest {

    private Display display;

    private Authentication auth;

    private User user;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        display = (Display)ctx.getBean("display");
    }

    @Before
    public void setUp2() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        auth = (Authentication)ctx.getBean("authentication");
    }

    @Before
    public void setUp3() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        user = (User)ctx.getBean("user");
    }



    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void confirmationMessage() throws Exception {

    }

}