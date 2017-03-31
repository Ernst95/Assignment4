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
public class MusicTest {

    private MusicInterface music;

    @Before
    public void setUp() throws Exception {
        ApplicationContext oCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        music = (MusicInterface) oCtx.getBean("music");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testPlay() throws Exception {
        assertEquals(music.play(), "playing music...");
    }

}