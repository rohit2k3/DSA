package com.binarysearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 8, 9, 11, 24, 55, 66};
        int target = 12;
        System.out.println(Floor(arr , target));
    }

    static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (arr[mid] == target) {
                return mid;
            }

        }
        return end;
    }
}
