package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testTests() {
        assertEquals(25, App.square(5));
        assertEquals(26, App.square(5));
    } 
}
