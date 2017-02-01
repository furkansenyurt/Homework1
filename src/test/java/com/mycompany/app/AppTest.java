package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array, 2, 2));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 10, 2));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 2, 2));
    }

    public void testNull() {
      assertFalse(new App().search(null, 3, 5));
    }
   public void testFirstIntNegativeAndSecontIntEven() {
     ArrayList<Integer> array = new ArrayList<>(Arrays.asList(4,2,16,8));
     assertTrue(new App().search(array, -2, 2));
    }
   public void testFirstIntNegativeAndSecondintOdd() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(4,2,16,-8));
      assertTrue(new App().search(array, -2, 3));
    }
}
