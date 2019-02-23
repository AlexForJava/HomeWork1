package com.gmail.chernii.oleksii;

import java.util.Arrays;

/**
 * Created by Space on 22.02.2019.
 */
public class ArraysSorting {
    public static void main(String[] args) {
        int[] array1 = new int[1000000];
        for (int i = 0; i < array1.length; i++)
            array1[i] = (int) (Math.random() * array1.length);
        int[] array2 = Arrays.copyOf(array1, array1.length);
        int[] array3 = Arrays.copyOf(array1, array1.length);
        int[] array4 = Arrays.copyOf(array1, array1.length);
        int[] array5 = Arrays.copyOf(array1, array1.length);

        long tStart;
        long tEnd;

        tStart = System.currentTimeMillis();
        quickSort(array1, 0, array1.length - 1);
        tEnd = System.currentTimeMillis();
        System.out.println("QuickSort = " + (tEnd - tStart) / 1000 + " sec " + (tEnd - tStart) % 1000);

        tStart = System.currentTimeMillis();
        mergeSort(array1, 0, array1.length - 1);
        tEnd = System.currentTimeMillis();
        System.out.println("MergeSort = " + (tEnd - tStart) / 1000 + " sec " + (tEnd - tStart) % 1000);

        tStart = System.currentTimeMillis();
        bubbleSort(array3);
        tEnd = System.currentTimeMillis();
        System.out.println("BubbleSort = " + (tEnd - tStart) / 1000 + " sec " + (tEnd - tStart) % 1000);

        tStart = System.currentTimeMillis();
        insertionSort(array4);
        tEnd = System.currentTimeMillis();
        System.out.println("InsertIntoSort = " + (tEnd - tStart) / 1000 + " sec " + (tEnd - tStart) % 1000);

        tStart = System.currentTimeMillis();
        selectionSort(array5);
        tEnd = System.currentTimeMillis();
        System.out.println("SelectionSort = " + (tEnd - tStart) / 1000 + " sec " + (tEnd - tStart) % 1000);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (high <= low)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        int[] buf = Arrays.copyOf(array, array.length);
        for (int k = low; k <= high; k++)
            buf[k] = array[k];
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                array[k] = buf[j];
                j++;
            } else if (j > high) {
                array[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                array[k] = buf[j];
                j++;
            } else {
                array[k] = buf[i];
                i++;
            }
        }
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void insertionSort (int[] array) {
        int temp, j;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int least = i;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int temp = array[i];
            array[i] = array[least];
            array[least] = temp;
        }
    }
}
