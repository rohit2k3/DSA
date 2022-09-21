package com.linearsearch;

import java.util.Arrays;

public class Searchin2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1,24,5,66,7,8,2},
                {9,6,76,78,7},
                {545,232,245,1244,453}
        };
        int target = 12944;
        int[] result = Search(arr, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] Search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                if (anInt == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
