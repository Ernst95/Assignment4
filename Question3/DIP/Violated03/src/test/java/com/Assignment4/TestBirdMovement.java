package com.Assignment4;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 3/22/16.
 */
public class TestBirdMovement {

    private Pidgeon pidgeon;
    private Peacock peacock;
    @Before
    public void setUp() throws Exception {
        ApplicationContext pCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        pidgeon = (Pidgeon) pCtx.getBean("pidgeon");
    }

    @Before
    public void setUpOstrich() throws Exception {

        ApplicationContext ostrichContext = new AnnotationConfigApplicationContext(AppConfig.class);
        peacock = (Peacock)ostrichContext.getBean("peacock");
    }

    @Test
    public void testPidgeonMove() throws Exception {
        assertEquals(pidgeon.fly(),"I am a Pidgeon I fly");
    }

    @Test
    public void testPeacockMove() throws Exception {
        assertEquals(peacock.run(),"I am a Peacock I run");

    }
}
