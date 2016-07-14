package com.wix.automationtraining;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[Factorial]Enter number? (up to 12 because of int))");
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        System.out.println("Result is " + factorial(n));

    }

    private static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
}
