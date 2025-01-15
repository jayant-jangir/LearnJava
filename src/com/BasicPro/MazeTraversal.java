package com.BasicPro;
import java.util.Arrays;

public class MazeTraversal {
    static int solutionCount = 0;
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int noOfRows = arr.length-1;
        int noOfCols = arr[0].length-1;

        mazeTraverse(arr, noOfRows, noOfCols, 1);
    }

    private static boolean checkIfObstacle(int[][] arr, int row, int col, int stepNo) {
        return row == 1 && col == 2 || row == 2 && col == 3;
    }

    private static void mazeTraverseInALLDir(int[][] arr, int row, int col, int stepNo) {
        if (checkIfObstacle(arr, row, col, stepNo)) return;
        arr[row][col] = stepNo;
        if (row == 0 && col == 0) {
            display(arr, ++solutionCount);
            arr[row][col] = 0;
            return;
        }

        if (row > 0 && arr[row-1][col]==0) {
            mazeTraverseInALLDir(arr, row-1, col, stepNo + 1);
        }
        if (col > 0 && arr[row][col-1]==0) {
            mazeTraverseInALLDir(arr, row, col-1, stepNo + 1);
        }
        if (row < arr.length-1 && arr[row+1][col]==0) {
            mazeTraverseInALLDir(arr, row+1, col, stepNo + 1);
        }
        if (col < arr[0].length-1 && arr[row][col+1]==0) {
            mazeTraverseInALLDir(arr, row, col+1, stepNo + 1);
        }

        arr[row][col] = 0;
    }

    private static void mazeTraverse(int[][] arr, int row, int col, int stepNo) {
        if (checkIfObstacle(arr, row, col, stepNo)) return;
        arr[row][col] = stepNo;
        if (row == 0 && col == 0) {
            display(arr, ++solutionCount);
            arr[row][col] = 0;
            return;
        }

        if (row > 0) {
            mazeTraverse(arr, row-1, col, stepNo+1);
        }
        if (col > 0) {
            mazeTraverse(arr, row, col-1, stepNo+1);
        }

        arr[row][col] = 0;
    }


    private static void display(int[][] arr, int solutionCount) {
        System.out.println("Solution: " + solutionCount);
        for (int[] row: arr) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
