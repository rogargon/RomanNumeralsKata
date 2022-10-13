package cat.udl.eps.softarch;

import java.util.ArrayList;

public class RomanNumeralsKata {
    private static final ArrayList<RomanSymbol> romanSymbols = new ArrayList<>();
    static {

        romanSymbols.add(new RomanSymbol("M", 1000));
        romanSymbols.add(new RomanSymbol("CM", 900));
        romanSymbols.add(new RomanSymbol("D", 500));
        romanSymbols.add(new RomanSymbol("CD", 400));
        romanSymbols.add(new RomanSymbol("C", 100));
        romanSymbols.add(new RomanSymbol("XC", 90));
        romanSymbols.add(new RomanSymbol("L", 50));
        romanSymbols.add(new RomanSymbol("XL", 40));
        romanSymbols.add(new RomanSymbol("X", 10));
        romanSymbols.add(new RomanSymbol("IX", 9));
        romanSymbols.add(new RomanSymbol("V", 5));
        romanSymbols.add(new RomanSymbol("IV", 4));
        romanSymbols.add(new RomanSymbol("I", 1));
    }

    public static String arabicToRoman(int arabic) {
        String romanResult = "";
        int arabicRemaining = arabic;

        for(RomanSymbol romanSymbol: romanSymbols) {
            ExtractRoman extractRoman = new ExtractRoman(romanSymbol, romanResult, arabicRemaining).extract();
            arabicRemaining = extractRoman.getArabicRemaining();
            romanResult = extractRoman.getRomanResult();
        }
        return romanResult;
    }

    private static class ExtractRoman {
        private String romanResult;
        private int arabicRemaining;
        private final RomanSymbol romanSymbol;

        public ExtractRoman(RomanSymbol romanSymbol, String romanResult, int arabicRemaining) {
            this.romanResult = romanResult;
            this.arabicRemaining = arabicRemaining;
            this.romanSymbol = romanSymbol;
        }

        public String getRomanResult() {
            return romanResult;
        }

        public int getArabicRemaining() {
            return arabicRemaining;
        }

        public ExtractRoman extract() {
            while (arabicRemaining >= romanSymbol.getArabicEquivalent()) {
                romanResult += romanSymbol;
                arabicRemaining -= romanSymbol.getArabicEquivalent();
            }
            return this;
        }
    }

    private static class RomanSymbol {
        private final String symbol;
        private final int arabicEquivalent;

        private RomanSymbol(String symbol, int arabicEquivalent) {
            this.symbol = symbol;
            this.arabicEquivalent = arabicEquivalent;
        }

        public int getArabicEquivalent() {
            return arabicEquivalent;
        }

        @Override
        public String toString() {
            return symbol;
        }
    }
}
