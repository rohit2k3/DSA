package com.binarysearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10,20,30,40},
            {11,22,33,44},
            {13,23,34,45},
            {15,26,36,48}
        };
        int target = 48;
        System.out.println(Arrays.toString(Search(matrix, target)));
    }
    static int[] Search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                return new int[] {r,c};
            }
            if (matrix[r][c] < target){
                r++;
            } else {
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
