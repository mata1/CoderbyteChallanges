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
    public void testPalindromeTwo() {
        assertTrue(Medium.panlindromeTwo("Noel - sees Leon"));
        assertTrue(Medium.panlindromeTwo("A war at Tarawa!"));
    }
    
    @Test
    public void testDivision() {
        assertEquals(1, Medium.division(7,3));
        assertEquals(18, Medium.division(36,54));
    }
    
    @Test
    public void testStringScramble() {
        assertTrue(Medium.stringScramble("cdore", "coder"));
        assertFalse(Medium.stringScramble("h3llko", "hello"));
    }
    
    @Test
    public void testArithGeoII() {
        assertEquals("Arithmetic", Medium.arithGeoII(new int[] {5, 10, 15}));
        assertEquals("-1", Medium.arithGeoII(new int[] {2, 4, 16, 24}));
        assertEquals("Geometric", Medium.arithGeoII(new int[] {2, 6, 18, 54}));
    }
    
    @Test
    public void testLetterCount() {
        assertEquals("Hello", Medium.letterCount("Hello apple pie"));
        assertEquals("-1", Medium.letterCount("No words"));
    }
    
    @Test
    public void testCaesarCipher() {
        assertEquals("Lipps", Medium.caesarCipher("Hello", 4));
        assertEquals("abc", Medium.caesarCipher("abc", 0));
    }
    
    @Test
    public void testNumberSearch() {
        assertEquals(4, Medium.numberSearch("H3ello9-9"));
        assertEquals(0, Medium.numberSearch("One Number*1*"));
    }
}
