package com.gmail.chernii.oleksii;

/**
 * Created by Space on 22.02.2019.
 */
public class RhombusDrawer {
    public static void main(String[] args) {
        int maxValue = 6;
        drawFillByValue(maxValue);
        System.out.println();
        drawEmptyByValue(maxValue);
        System.out.println();
    }

    public static void drawEmptyBySide(int maxSide) {
        int decrease = maxSide - 1;
        int increase = 1;

        for (int i = 0; i < 2 * maxSide - 1; i++) {
            if (i < maxSide) {
                for (int j = 0; j < 2 * maxSide - 1; j++) {
                    if (j == decrease || j == (2 * (maxSide - 1) - decrease)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                decrease--;
                System.out.println();
            } else {
                for (int j = 0; j < 2 * maxSide - 1; j++) {
                    if (j == increase || j == (2 * (maxSide - 1) - increase)) {
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

    public static void drawFillBySide(int maxSide) {
        int decrease = maxSide - 1;
        int increase = 1;

        for (int i = 0; i < 2 * maxSide - 1; i++) {
            if (i < maxSide) {
                for (int j = 0; j < 2 * maxSide - 1; j++) {
                    if (j >= decrease && j <= (2 * (maxSide - 1) - decrease)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                decrease--;
                System.out.println();
            } else {
                for (int j = 0; j < 2 * maxSide - 1; j++) {
                    if (j >= increase && j <= (2 * (maxSide - 1) - increase)) {
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


    public static void drawEmptyByValue(int maxValue) {
        int decrease = maxValue / 2;
        int increase = 1;
        for (int i = 0; i < maxValue; i++) {
            if (i < maxValue / 2 + 1) {
                for (int j = 0; j <= maxValue; j++) {
                    if ((j == decrease || j == (maxValue - decrease - 1)) && (decrease <= maxValue - decrease - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                decrease--;
                System.out.println();
            } else {
                for (int j = 0; j <= maxValue; j++) {
                    if (j == increase || j == (maxValue - increase - 1)) {
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

    public static void drawFillByValue(int maxValue) {
        int decrease = maxValue / 2;
        int increase = 1;
        for (int i = 0; i < maxValue; i++) {
            if (i < maxValue / 2 + 1) {
                for (int j = 0; j <= maxValue; j++) {
                    if (j >= decrease && j <= (maxValue - decrease - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                decrease--;
                System.out.println();
            } else {
                for (int j = 0; j <= maxValue; j++) {
                    if (j >= increase && j <= (maxValue - increase - 1)) {
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
