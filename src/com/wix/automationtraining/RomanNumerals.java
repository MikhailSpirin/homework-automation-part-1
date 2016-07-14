package com.wix.automationtraining;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mikhails on 14.07.2016.
 */
public class RomanNumerals {
    static Map<Integer, String> romanNums = new HashMap<>();

    public static void main(String[] args) {
        initRomanNumbersData();
        for (int i = 1; i < 11 ; i++) {
            System.out.println("roman number for " + i + " is: " + makeRomanNumberFrom(i));
        }
    }

    private static String makeRomanNumberFrom(int number) {
        for (Map.Entry<Integer, String> value : romanNums.entrySet()) {
            if (value.getKey() == number) return value.getValue();
            }
        return null;
    }

    private static void initRomanNumbersData(){
        romanNums.put(10, "X");
        romanNums.put(9, "IX");
        romanNums.put(8, "VIII");
        romanNums.put(7, "VII");
        romanNums.put(6, "VI");
        romanNums.put(5, "V");
        romanNums.put(4, "IV");
        romanNums.put(3, "III");
        romanNums.put(2, "II");
        romanNums.put(1, "I");
    }
}
