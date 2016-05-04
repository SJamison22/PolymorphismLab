package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by stevejaminson on 5/4/16.
 */
public class DogsTest {

    @Test
    public void speakTest(){
        Dogs dog = new Dogs();
        String expected = "I am a dog";
        String actual = dog.speak();
        assertEquals(expected,actual);
    }
}
