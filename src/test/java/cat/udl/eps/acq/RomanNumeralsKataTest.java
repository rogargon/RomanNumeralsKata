package cat.udl.eps.acq;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsKataTest {

    @Test
    public void testOneTwoThree() throws Exception {
        assertEquals("1", "I", RomanNumeralsKata.arabicToRoman(1));
        assertEquals("2", "II", RomanNumeralsKata.arabicToRoman(2));
        assertEquals("3", "III", RomanNumeralsKata.arabicToRoman(3));
    }

    @Test
    public void testFour() throws Exception {
        assertEquals("4", "IV", RomanNumeralsKata.arabicToRoman(4));
    }

    @Test
    public void testFive() throws Exception {
        assertEquals("5", "V", RomanNumeralsKata.arabicToRoman(5));
    }

    @Test
    public void testSixSevenEight() throws Exception {
        assertEquals("6", "VI", RomanNumeralsKata.arabicToRoman(6));
        assertEquals("7", "VII", RomanNumeralsKata.arabicToRoman(7));
        assertEquals("8", "VIII", RomanNumeralsKata.arabicToRoman(8));
    }

    @Test
    public void testNineTenEleven() throws Exception {
        assertEquals("9", "IX", RomanNumeralsKata.arabicToRoman(9));
        assertEquals("10", "X", RomanNumeralsKata.arabicToRoman(10));
        assertEquals("11", "XI", RomanNumeralsKata.arabicToRoman(11));
        assertEquals("14", "XIV", RomanNumeralsKata.arabicToRoman(14));
    }

    @Test
    public void testFifteenSeventeenNineteen() throws Exception {
        assertEquals("15", "XV", RomanNumeralsKata.arabicToRoman(15));
        assertEquals("17", "XVII", RomanNumeralsKata.arabicToRoman(17));
        assertEquals("19", "XIX", RomanNumeralsKata.arabicToRoman(19));
    }

    @Test
    public void testTwentyTwentyoneTwentyfour() throws Exception {
        assertEquals("20", "XX", RomanNumeralsKata.arabicToRoman(20));
        assertEquals("21", "XXI", RomanNumeralsKata.arabicToRoman(21));
        assertEquals("24", "XXIV", RomanNumeralsKata.arabicToRoman(24));
    }

    @Test
    public void testFortyNine() throws Exception {
        assertEquals("49", "XLIX", RomanNumeralsKata.arabicToRoman(49));
    }

    @Test
    public void testBiggestRoman() throws Exception {
        assertEquals("3999", "MMMCMXCIX", RomanNumeralsKata.arabicToRoman(3999));
    }
}