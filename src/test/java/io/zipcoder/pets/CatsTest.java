package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevejaminson on 5/4/16.
 */
public class CatsTest {

    @Test
    public void speakTest(){
        Cats cat = new Cats();
        String expected = "I am a cat";
        String actual = cat.speak();
        assertEquals(expected,actual);
    }
}
