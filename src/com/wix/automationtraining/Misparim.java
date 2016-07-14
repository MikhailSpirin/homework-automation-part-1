package com.wix.automationtraining;

/**
 * Created by mikhails on 14.07.2016.
 */
public class Misparim {

    public static void main(String[] args) {
        System.out.println(rowOfNumbersMultipleTo(2, 20));
        System.out.println(rowOfNumbersMultipleTo(3, 20));
        System.out.println(rowOfNumbersMultipleTo(4, 20));
    }

    private static String rowOfNumbersMultipleTo(int multiple, int max){
        String result = "";
        for (int i = 1; i<=max; i++) {
            if ((i % multiple)==0) result += (i + " ");
        }
        return result;
    }
}
