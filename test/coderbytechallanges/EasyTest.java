/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coderbytechallanges;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matej
 */
public class EasyTest {
    
    public EasyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of firstReverse method, of class Easy.
     */
    @Test
    public void testFirstReverse() {
        String str = "I Love Code";
        String expResult = "edoC evoL I";
        
        assertEquals(expResult, Easy.firstReverse(str));

    }
    
}
