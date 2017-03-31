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
public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        ApplicationContext vCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        rectangle = (Rectangle)vCtx.getBean("rectangle");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getBreadth() throws Exception {
        double breadth = rectangle.getBreadth();
        assertEquals(2.0, breadth,0);
    }

    @Test
    public void getLength() throws Exception {
        double length = rectangle.getLength();
        assertEquals(4.0, length,0);
    }

}