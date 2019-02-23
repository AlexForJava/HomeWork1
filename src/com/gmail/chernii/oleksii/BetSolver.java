package com.gmail.chernii.oleksii;

/**
 * Created by Space on 22.02.2019.
 */
public class BetSolver {
    public static void main(String[] args) {

        int a, b, c, d;
        for (int i = 0; i < 10; i++) {
            a = (int) (Math.random() * 5);
            b = (int) (Math.random() * 5);
            c = (int) (Math.random() * 5);
            d = (int) (Math.random() * 5);

            System.out.println(a + ":" + b + " == " + c + ":" + d + " => " + solve(a, b, c, d));
        }

    }

    public static int solve(int resultFirst, int resultSecond, int betFirst, int betSecond) {
        int[] array = {resultFirst, resultSecond, betFirst, betSecond};
        return (maxWin(array)) ? 2 : (hasWin(array)) ? 1 : 0;
    }

    private static boolean maxWin(int[] array) {
        return (array[0] == array[2] && array[1] == array[3]);
    }
    private static boolean hasWin(int[] array){
        return (array[0] > array[1] && array[2] > array[3]) || (array[0] < array[1] && array[2] < array[3]) || (array[0] == array[1] && array[2] == array[3]);
    }
}
