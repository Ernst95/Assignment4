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
public class TextTest {

    private TextInterface text;

    @Before
    public void setUp() throws Exception {
        ApplicationContext oCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        text = (TextInterface) oCtx.getBean("text");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCall() throws Exception {
        assertEquals(text.textMessage(), "texting message...");
    }

}