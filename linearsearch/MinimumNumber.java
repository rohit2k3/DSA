package com.linearsearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {15, 5, 14, 2, 6, 323, 432, 24, 52, 425, 54};
        int result = SearchMin(arr);
        System.out.println(result);
    }
    static int SearchMin(int[] arr){
        int minNum = arr[0];
        for (int num: arr){
            if (num<minNum){
                minNum = num;
            }
        }
        return minNum;
    }
}
