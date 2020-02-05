package com.bvek.demo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testProduct() {
        
        App T = new App();
        assertEquals("10* 5 equals to 50",50,T.product(10,5));
    }
    @Test
    public void testDivide(){
        App D = new App();
        int x = 10;
        int y =5;
        assertEquals("10/5 equals to 2",2,D.divide(x,y));
        assertTrue(x>y);
    }
    @Test
    public void testCompare(){
        App C= new App();

        assertEquals("RamShyam",C.Compare("Ram", "Shyam"));

    }
}