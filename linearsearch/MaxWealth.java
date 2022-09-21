package com.linearsearch;

public class MaxWealth {
    public static void main(String[] args) {
    int[][] arr = {{1, 4, 2}, { 3, 6, 7}, {9, 4, 6}};
        System.out.println(Max(arr));
    }

    static int Max(int[][] arr){
        int greater = 0;
        for (int element[] : arr){
            int totals = Total(element);
            if (greater < totals){
                greater = totals;
            }
        }
        return greater;
    }
    static int Total(int[] arrr){
        int count = 0;
        for (int ele : arrr){
            count = count+ ele;
        }
        return count;
    }

}
