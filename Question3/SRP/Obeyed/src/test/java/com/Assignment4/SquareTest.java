package com.Assignment4;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 3/19/16.
 */
public class SquareTest {

    private Area square;

    @Before
    public void setUpAreaCalculation() throws Exception {

        ApplicationContext obeyContext= new AnnotationConfigApplicationContext(AppConfig.class);
        square = (Area) obeyContext.getBean("square");

    }

    @Test
    public void testGetSide() throws Exception {

        double side = square.getSide();
        assertEquals(side, 10.0,0);
    }

    @Test
    public void testCalcArea() throws Exception {
        double area = square.calculateArea();
        assertEquals(100.0, area,0);
    }
}
