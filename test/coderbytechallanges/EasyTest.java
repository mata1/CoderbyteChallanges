/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coderbytechallanges;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matej
 */
public class EasyTest {
    
    public EasyTest() {}
    
    @Test
    public void testFirstReverse() {
        assertEquals("edoC evoL I", Easy.firstReverse("I Love Code"));
    }
    
    @Test
    public void testFirstFactorial() {
        assertEquals(24, Easy.firstFactorial(4));
        assertEquals(40320, Easy.firstFactorial(8));
    }
    
    @Test
    public void testLongestWord() {
        assertEquals("time", Easy.longestWord("fun&!! time"));
        assertEquals("love", Easy.longestWord("I love dogs"));
    }
    
    @Test
    public void testLetterChanges() {
        assertEquals("Ifmmp*3", Easy.letterChanges("hello*3"));
        assertEquals("gvO Ujnft!", Easy.letterChanges("fun times!"));
    }
    
    @Test
    public void testSimpleAdding() {
        assertEquals(78, Easy.simpleAdding(12));
        assertEquals(9870, Easy.simpleAdding(140));
    }
    
    @Test
    public void testLetterCapitalize() {
        assertEquals("Hello World", Easy.letterCapitalize("hello world"));
        assertEquals("I Ran There", Easy.letterCapitalize("i ran there"));
    }
    
    @Test
    public void testSimpleSymbol() {
        assertTrue(Easy.simpleSymbols("+d+=3=+s+"));
        assertFalse(Easy.simpleSymbols("f++d+"));
    }
    
    @Test
    public void testCheckNums() {
        assertEquals("true", Easy.checkNums(3, 122));
        assertEquals("-1", Easy.checkNums(67, 67));
    }
    
    @Test
    public void testTimeConvert() {
        assertEquals("2:6", Easy.timeConvert(126));
        assertEquals("0:45", Easy.timeConvert(45));
    }
    
    @Test
    public void testAlphabetSoup() {
        assertEquals("bcdeeorty", Easy.alphabetSoup("coderbyte"));
        assertEquals("ahhloop", Easy.alphabetSoup("hooplah"));
    }
}
