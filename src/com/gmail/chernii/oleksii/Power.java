package com.gmail.chernii.oleksii;

/**
 * Created by Space on 22.02.2019.
 */
public class Power {
    public static void main(String[] args) {
        System.out.println(powRecursion(2, 5));
        System.out.println(powCycle(2, 5));
    }

    public static int powRecursion(int number, int degree) {
        if (degree <= 0) {
            return 1;
        }
        return number * powRecursion(number, degree - 1);
    }

    public static int powCycle(int number, int degree) {
        if (degree <= 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= degree; i++) {
            result *= number;
        }
        return result;
    }
}
