package JoseCamino.RomanNumerals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RomanNumeralsTest {

    @Test
    public void testUnitsConversionToRoman() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("I", romanNumerals.numberConverter(1));
        assertEquals("II", romanNumerals.numberConverter(2));
        assertEquals("III", romanNumerals.numberConverter(3));
        assertEquals("IV", romanNumerals.numberConverter(4));
        assertEquals("V", romanNumerals.numberConverter(5));
        assertEquals("VI", romanNumerals.numberConverter(6));
        assertEquals("VII", romanNumerals.numberConverter(7));
        assertEquals("VIII", romanNumerals.numberConverter(8));
        assertEquals("IX", romanNumerals.numberConverter(9));
    }

    @Test
    public void testTensConversionToRoman() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("X", romanNumerals.numberConverter(10));
        assertEquals("XX", romanNumerals.numberConverter(20));
        assertEquals("XXX", romanNumerals.numberConverter(30));
        assertEquals("XL", romanNumerals.numberConverter(40));
        assertEquals("L", romanNumerals.numberConverter(50));
        assertEquals("LX", romanNumerals.numberConverter(60));
        assertEquals("LXX", romanNumerals.numberConverter(70));
        assertEquals("LXXX", romanNumerals.numberConverter(80));
        assertEquals("XC", romanNumerals.numberConverter(90));
    }

    @Test
    public void testHundredsConversionToRoman() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("C", romanNumerals.numberConverter(100));
        assertEquals("CC", romanNumerals.numberConverter(200));
        assertEquals("CCC", romanNumerals.numberConverter(300));
        assertEquals("CD", romanNumerals.numberConverter(400));
        assertEquals("D", romanNumerals.numberConverter(500));
        assertEquals("DC", romanNumerals.numberConverter(600));
        assertEquals("DCC", romanNumerals.numberConverter(700));
        assertEquals("DCCC", romanNumerals.numberConverter(800));
        assertEquals("CM", romanNumerals.numberConverter(900));
    }

    @Test
    public void testThousandsConversionToRoman() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("M", romanNumerals.numberConverter(1000));
        assertEquals("MM", romanNumerals.numberConverter(2000));
        assertEquals("MMM", romanNumerals.numberConverter(3000));
    }

    @Test
    public void testNumbersGreaterThan4000() {
        RomanNumerals romanNumerals = new RomanNumerals();

        try {
            romanNumerals.numberConverter(4000);
            fail("Expected IllegalArgumentException for input 4000");
        } catch (IllegalArgumentException e) {
            assertEquals("Input number cannot be greater than or equal to 4000 in traditional Roman numerals", e.getMessage());
        }

        try {
            romanNumerals.numberConverter(5000);
            fail("Expected IllegalArgumentException for input 5000");
        } catch (IllegalArgumentException e) {
            assertEquals("Input number cannot be greater than or equal to 4000 in traditional Roman numerals", e.getMessage());
        }

        try {
            romanNumerals.numberConverter(10000);
            fail("Expected IllegalArgumentException for input 10000");
        } catch (IllegalArgumentException e) {
            assertEquals("Input number cannot be greater than or equal to 4000 in traditional Roman numerals", e.getMessage());
        }
    }

    @Test
    public void testOddNumbersConversionToRoman() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("I", romanNumerals.numberConverter(1));
        assertEquals("III", romanNumerals.numberConverter(3));
        assertEquals("V", romanNumerals.numberConverter(5));
        assertEquals("VII", romanNumerals.numberConverter(7));
        assertEquals("IX", romanNumerals.numberConverter(9));
    }

    @Test
    public void testEvenNumbersConversionToRoman() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("II", romanNumerals.numberConverter(2));
        assertEquals("IV", romanNumerals.numberConverter(4));
        assertEquals("VI", romanNumerals.numberConverter(6));
        assertEquals("VIII", romanNumerals.numberConverter(8));
    }

    @Test
    public void testNegativeNumberConversion() {
        var romanNumerals = new RomanNumerals();

        try {
            romanNumerals.numberConverter(-1);
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Input number cannot be negative", e.getMessage());
        }
    }
}
