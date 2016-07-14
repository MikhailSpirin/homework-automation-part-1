package com.wix.automationtraining;

/**
 * Created by mikhails on 14.07.2016.
 */
public class StarBaseTriangle {
    public static final int STAR_BASE_ROWS = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= STAR_BASE_ROWS; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }

}
