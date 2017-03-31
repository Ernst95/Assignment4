package com.Assignment4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ernst on 2017/03/31.
 */
public class SquareTest {

    private Square square;

    @Before
    public void setUp() throws Exception {
        ApplicationContext vCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        square = (Square) vCtx.getBean("square");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getSide1() throws Exception {
        double side = square.getSide();
        assertEquals(10.0,side,0);
    }

    @Test
    public void testCalcultaeArea() throws Exception
    {
        double area = square.calculateArea();
        assertEquals(100.0, area,0);
    }

}