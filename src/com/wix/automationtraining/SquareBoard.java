package com.wix.automationtraining;

/**
 * Created by mikhails on 14.07.2016.
 */
public class SquareBoard {
    public static void main(String[] args) {
        printSquareBoard(5);
    }

    private static void printSquareBoard(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print("# ");
            System.out.println();
        }
    }
}
