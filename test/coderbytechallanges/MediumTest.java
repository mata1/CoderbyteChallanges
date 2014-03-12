package coderbytechallanges;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matej
 */
public class MediumTest {
    /*
    // TEMPLATE
    @Test
    public void test() {
        assertEquals("", Medium.(""));
        assertEquals("", Medium.(""));
    }
    */
    
    public MediumTest() { }

    @Test
    public void testPrimeTime() {
        assertTrue(Medium.primeTime(19));
        assertFalse(Medium.primeTime(110));
    }
    
    @Test
    public void testRunLength() {
        assertEquals("2a2b1c1d1e", Medium.runLength("aabbcde"));
        assertEquals("3w3b1w", Medium.runLength("wwwbbbw"));
    }
    
    @Test
    public void testPrimeMover() {
        assertEquals(23, Medium.primeMover(9));
        assertEquals(541, Medium.primeMover(100));
    }
    
    @Test
    public void test() {
        assertTrue(Medium.panlindromeTwo("Noel - sees Leon"));
        assertTrue(Medium.panlindromeTwo("A war at Tarawa!"));
    }
}
