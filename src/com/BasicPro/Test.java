package com.BasicPro;
import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        int[] arr = {6, 0, 8, 7, 1, 2, 3, 4, 5};
//        bubble(arr);
//        selection(arr);
//        cycle(arr);
        System.out.println(missing(arr));;
        System.out.println(Arrays.toString(arr));
    }

    // Cycle sort
    static void cycle(int[] arr) {
        for (int i = 0; i < arr.length; ) {
            int correctIndex = arr[i] - 1;

            if (correctIndex != i)
                swap(arr, correctIndex, i);
            else ++i;
        }
    }

    // In case of continuous numbers, fine missing element
    static int missing(int[] arr) {
        for (int i = 0; i < arr.length; ) {
            int correctIndex = arr[i];

            if (correctIndex < arr.length && correctIndex != i)
                swap(arr, correctIndex, i);
            else ++i;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) return i;
        }

        return arr.length;

    }

    // Selection sort
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int maxPos = findMax(arr, i, arr.length);
            swap(arr, i, maxPos);
        }
    }

    // Insertion sort
    static void insertion(int[] arr) {
        for (int i=1; i< arr.length; i++) {
            int j = i;
            while (j>0) {
                if (arr[j] < arr[j-1]) {
                    swap (arr, j, j-1);
                    j--;
                } else break;
            }
        }
    }

    static int findMax(int[] arr, int start, int end) {
        int maxPos = start;
        for (int i = start; i < end; i++) {
            if (arr[i] > arr[maxPos]) {
                maxPos = i;
            }
        }
        return maxPos;
    }

    // Bubble sort
    static void bubble(int[] arr) {
        boolean isSwap;
        for (int i = 0; i < arr.length; i++) {
            isSwap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    swap (arr, j-1, j);
                    isSwap = true;
                }
            }
            if(!isSwap) break;
        }
    }

    // Swap elements
    static void swap (int[] arr, int p, int q) {
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }

}