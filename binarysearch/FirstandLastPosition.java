package com.binarysearch;

import java.util.Arrays;

public class FirstandLastPosition {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 6, 6, 6};
        int target = 1;
        System.out.println(Arrays.toString(Search(Arr, target)));
    }
    static int[] Search(int[] arr, int target) {
        int v1 = 0;
        int v2 = 0;
        for (int i1 : arr) {
            if (i1 == target) {
                v1 = i1;
                break;
            } else {
                v1 = -1;
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == target) {
                v2 = i;
                break;
            } else
                v2 = -1;
        }
        return new int[] {v1, v2};
    }
}
