package com.gmail.chernii.oleksii;

/**
 * Created by Space on 22.02.2019.
 */
public class Task1_3 {
    public static void main(String[] args) {
        System.out.println(powRecursion(2, 5));
        System.out.println(powCycle(2, 5));
    }

    public static int powRecursion(int a, int b) {
        if (b <= 0)
            return 1;
        return a * powRecursion(a, b - 1);
    }

    public static int powCycle(int a, int b) {
        if (b <= 0)
            return 1;
        int result = 1;
        for (int i = 1; i <= b; i++)
            result *= a;
        return result;
    }
}
