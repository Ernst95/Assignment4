package com.Assignment4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

import static org.junit.Assert.*;

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
        double side = square.getSide1();
        assertEquals(10.0,side,0);
    }

}