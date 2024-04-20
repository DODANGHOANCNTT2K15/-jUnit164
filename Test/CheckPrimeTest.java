package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import Source.CheckPrime;

public class CheckPrimeTest {

    @Test
    public void testCheckNumber_Prime() {
        CheckPrime checker = new CheckPrime();
        assertTrue(checker.CheckNumber(2));
        assertTrue(checker.CheckNumber(17));
        assertTrue(checker.CheckNumber(97));
    }

    @Test
    public void testCheckNumber_NotPrime() {
        CheckPrime checker = new CheckPrime();
        assertFalse(checker.CheckNumber(1));
        assertFalse(checker.CheckNumber(4));
        assertFalse(checker.CheckNumber(15));
    }

    @Test
    public void testCheckNumber_Negative() {
        CheckPrime checker = new CheckPrime();
        assertFalse(checker.CheckNumber(-2));
        assertFalse(checker.CheckNumber(-17));
    }
}
