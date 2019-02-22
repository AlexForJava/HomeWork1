package com.gmail.chernii.oleksii;

/**
 * Created by Space on 22.02.2019.
 */
public class Task1_4 {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursion(7));
        System.out.println(factorial(7));
    }

    public static int fibonacciRecursion(int n) {
        if (n <= 0)
            return 1;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
