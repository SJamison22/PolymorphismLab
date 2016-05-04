package io.zipcoder.pets;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by stevejaminson on 5/4/16.
 */
public class PetsTest {

    @Test
    public void speakTest(){
        Pets pets = new Pets();
        String expected = "I am a pet";
        String actual = pets.speak();
        assertEquals(expected,actual);
    }
}
