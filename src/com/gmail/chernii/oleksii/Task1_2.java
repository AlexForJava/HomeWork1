package com.gmail.chernii.oleksii;

/**
 * Created by Space on 22.02.2019.
 */
public class Task1_2 {
    public static void main(String[] args) {
        drawEmpty(5);
        System.out.println();
        drawFill(5);
    }

    public static void drawEmpty(int n) {
        int decrease = n - 1;
        int increase = 1;

        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                for (int j = 0; j < 2 * n - 1; j++) {
                    if (j == decrease || j == (2 * (n - 1) - decrease)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                decrease--;
                System.out.println();
            } else {
                for (int j = 0; j < 2 * n - 1; j++) {
                    if (j == increase || j == (2 * (n - 1) - increase)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                increase++;
                System.out.println();
            }
        }
    }

    public static void drawFill(int n){
        int decrease = n - 1;
        int increase = 1;

        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                for (int j = 0; j < 2 * n - 1; j++) {
                    if (j >= decrease && j <= (2 * (n - 1) - decrease)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                decrease--;
                System.out.println();
            } else {
                for (int j = 0; j < 2 * n - 1; j++) {
                    if (j >= increase && j <= (2 * (n - 1) - increase)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                increase++;
                System.out.println();
            }
        }
    }
}
