package cat.udl.eps.softarch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsKataTest {

    @Test
    public void testOneTwoThree() {
        assertEquals("I", RomanNumeralsKata.arabicToRoman(1));
        assertEquals("II", RomanNumeralsKata.arabicToRoman(2));
        assertEquals("III", RomanNumeralsKata.arabicToRoman(3));
    }

    @Test
    public void testFour() {
        assertEquals("IV", RomanNumeralsKata.arabicToRoman(4));
    }

    @Test
    public void testFive() {
        assertEquals("V", RomanNumeralsKata.arabicToRoman(5));
    }

    @Test
    public void testSixSevenEight() {
        assertEquals("VI", RomanNumeralsKata.arabicToRoman(6));
        assertEquals("VII", RomanNumeralsKata.arabicToRoman(7));
        assertEquals("VIII", RomanNumeralsKata.arabicToRoman(8));
    }

    @Test
    public void testNineTenEleven() {
        assertEquals("IX", RomanNumeralsKata.arabicToRoman(9));
        assertEquals("X", RomanNumeralsKata.arabicToRoman(10));
        assertEquals("XI", RomanNumeralsKata.arabicToRoman(11));
        assertEquals("XIV", RomanNumeralsKata.arabicToRoman(14));
    }

    @Test
    public void testFifteenSeventeenNineteen() {
        assertEquals("XV", RomanNumeralsKata.arabicToRoman(15));
        assertEquals("XVII", RomanNumeralsKata.arabicToRoman(17));
        assertEquals("XIX", RomanNumeralsKata.arabicToRoman(19));
    }

    @Test
    public void testTwentyTwentyoneTwentyfour() {
        assertEquals("XX", RomanNumeralsKata.arabicToRoman(20));
        assertEquals("XXI", RomanNumeralsKata.arabicToRoman(21));
        assertEquals("XXIV", RomanNumeralsKata.arabicToRoman(24));
    }

    @Test
    public void testFortyNine() {
        assertEquals("XLIX", RomanNumeralsKata.arabicToRoman(49));
    }

    @Test
    public void testBiggestRoman() {
        assertEquals("MMMCMXCIX", RomanNumeralsKata.arabicToRoman(3999));
    }
}
