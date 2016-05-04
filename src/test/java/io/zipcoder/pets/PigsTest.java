package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevejaminson on 5/4/16.
 */
public class PigsTest {

    @Test
    public void speakTest(){
        Pigs pig = new Pigs();
        String expected = "I am a pig";
        String actual = pig.speak();
        assertEquals(expected,actual);
    }
}
