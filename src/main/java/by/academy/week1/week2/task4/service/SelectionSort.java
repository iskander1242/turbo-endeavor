package by.academy.week1.week2.task4.service;

import java.util.Arrays;

/**
 * @author Александр Соколов
 * @since 2019-03-17
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] unsorted = new int[]{1, 10, 9, 8, 8, 6, 5, 4, 3, 2};
        System.out.println(Arrays.toString(new SelectionSort().sort(unsorted)));
    }

    private int min(int[] unsorted) {
        int i = 0;
        int min = unsorted[i];
        for (int k = 1; k < unsorted.length; k++) {
            if (min > unsorted[k]) {
                min = unsorted[k];
                i = k;
            }
        }
        return i;
    }

    public int[] sort(int[] unsorted) {
        int[] sorted = new int[unsorted.length];
        for (int i = 0; i < sorted.length; i++) {
            int[] newUnsorted = new int[unsorted.length - 1];
            int newUnsortedIndex = 0;
            int min = new SelectionSort().min(unsorted);
            for (int j = 0; j < unsorted.length; j++) {
                if (j != min) {
                    newUnsorted[newUnsortedIndex] = unsorted[j];
                    newUnsortedIndex++;
                } else {
                    sorted[i] = unsorted[min];
                }
            }
            unsorted = newUnsorted;
        }
        return sorted;
    }
}