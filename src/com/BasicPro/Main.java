package com.BasicPro;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {16, 26, 36, 41, 43},
                {17, 27, 37, 47},
                {18, 28, 38, 48, 58},
                {19, 29, 39, 49},
                {20, 30, 40, 50, 60}
        };

        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int[] rows = createRows(arr.length);
        int column = 0;
        for (int row : rows) {
            int[] cols = createRows(arr[row].length);
            for (int col : cols) {
                System.out.print(Arrays.toString(searchIndex(arr, arr[row][col], rowStart, rowEnd, column, arr.length, 0)) + "\t\t");
            }
            System.out.println();
        }
    }

    private static int[] createRows(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    static int[] searchIndex(int[][] arr, int target, int rowStart, int rowEnd, int col, int highest, int lowest) {
        int rowMid = rowStart + (rowEnd - rowStart) / 2;
        int colEnd = arr[rowMid].length-1;

        if (arr[rowMid][col] == target) {
            return new int[] {rowMid, col};
        }

        if (arr[rowMid][col] < target && target <= arr[rowMid][colEnd]) {
            int[] result = binarySearch(arr, rowMid, col, arr[rowMid].length-1, target);
            if(result[0] != -1) {
                return result;
            }
        }

        if (rowMid-1 >=0 && rowMid-1 >= lowest && target <= arr[rowMid-1][arr[rowMid-1].length-1]) {
            int[] result = searchIndex(arr, target, rowStart, rowMid-1, col, rowMid-1, rowStart);
            while (result[0] != -1) {
                return result;
            }
        }

        if (rowMid+1 <= rowEnd && rowMid+1 <= highest && target >= arr[rowMid+1][col]) {
            int[] result =  searchIndex(arr, target, rowMid+1, rowEnd, col, rowEnd, rowMid+1);
            if(result[0] != -1) {
                return result;
            }
        }

        return new int[]{-1, -1};
    }

    static int[] binarySearch(int[][] arr, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int colMid = colStart + (colEnd - colStart) / 2;
            if (arr[row][colMid] == target) {
                return new int[] {row, colMid};
            }
            else if (arr[row][colMid] < target) {
                colStart = colMid + 1;
            }
            else {
                colEnd = colMid - 1;
            }
        }

        return new int[] {-1, -1};
    }

}