package org.example;

public class RomanNumerals {

    private final String[] romanLetters = { "M" , "CM" , "D" , "CD" , "C" , "XC" , "L" , "XL" , "X" , "IX" , "V" , "IV" , "I" };
    private final Integer[] values = { 1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1 };

    public RomanNumerals() {}

    public String numberConverter(Integer number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input number cannot be negative");
        }

        if (number >= 4000) {
            throw new IllegalArgumentException("Input number cannot be greater than or equal to 4000 in traditional Roman numerals");
        }

        var size = this.values.length;
        var sb = new StringBuilder();
        for(int i = 0; i < size; i++ ) {
            if (number >= this.values[i]) {
                number -= values[i];
                sb.append(romanLetters[i]);
                i--;
            }
        }
        return sb.toString();
    }
}