package com.gmail.chernii.oleksii;

/**
 * Created by Space on 22.02.2019.
 */
public class Task1_1 {
    public static void main(String[] args) {

        int a, b, c, d;
        for (int i = 0; i < 10; i++) {
            a = (int) (Math.random() * 5);
            b = (int) (Math.random() * 5);
            c = (int) (Math.random() * 5);
            d = (int) (Math.random() * 5);

            System.out.println(a + ":" + b + " == " + c + ":" + d + " => " + task1(a, b, c, d));
        }

    }

    public static int task1(int a, int b, int c, int d) {
        return (a == c && b == d) ? 2 : (a > b && c > d) || (a < b && c < d) || (a == b && c == d) ? 1 : 0;
    }
}
