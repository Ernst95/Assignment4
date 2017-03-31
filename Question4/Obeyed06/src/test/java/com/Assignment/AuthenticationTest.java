package com.Assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/03/31.
 */
public class AuthenticationTest {

    private Authentication auth;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        auth = (Authentication)ctx.getBean("authentication");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void authenticate() throws Exception {

    }

}