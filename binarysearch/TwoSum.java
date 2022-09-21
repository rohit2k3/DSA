package com.binarysearch;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(Search(arr,target)));
    }
    static int[] Search(int[] numbers, int target){
        int start = 0;
        int end = numbers.length - 1;
        while (end >= start){
            if (numbers[start] + numbers[end] == target){
                return new int[] {++start, ++end};
            }
            int mid = start + (end - start)/2;
            if (numbers[mid] < target){
                end = mid+1;
            }else {
                start = mid;
            }
        }
        return new int[] {-1, -1};
    }
}
