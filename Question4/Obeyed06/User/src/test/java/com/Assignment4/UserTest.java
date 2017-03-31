package com.Assignment4;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/03/31.
 */
public class UserTest {

    private User user;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        user = (User)ctx.getBean("user");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetUsername() throws Exception {
        assertEquals("Ernst",user.getUsername());
    }

    @Test
    public void testGetPassword() throws Exception {
        assertEquals("1234", user.getPassword());
    }

}