package com.linearsearch;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {15, 5, 14, 2, 6, 323, 432, 24, 52, 425, 54};
        int target = 65;
        boolean result = Search(arr, target, 1, 6);
        System.out.println(result);
    }

    static boolean Search(int[] arr, int target, int start, int end) {
        if (arr.length == 0){
            return false;
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target){
                return true;
            }
        }
        return false;

    }
}
