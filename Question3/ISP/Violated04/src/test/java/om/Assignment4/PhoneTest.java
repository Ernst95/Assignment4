package om.Assignment4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/03/31.
 */
public class PhoneTest {

    private PhoneServices phone;

    @Before
    public void setUp() throws Exception {
        ApplicationContext phoneContext = new AnnotationConfigApplicationContext(AppConfig.class);
        phone = (Phone)phoneContext.getBean("phone");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void call() throws Exception {
        assertEquals(phone.call(),"calling...");
    }

    @Test
    public void takePhoto() throws Exception {
        assertEquals(phone.takePhoto(),"taking photo...");
    }

    @Test
    public void playMusic() throws Exception {
        assertEquals(phone.playMusic(),"playing music...");
    }

    @Test
    public void textMessage() throws Exception {
        assertEquals(phone.textMessage(), "texting message...");
    }
}