package com.binarysearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {99,55,43,36,23,12,6,4,3,-3,-5,-89};
        int target = 34;
        System.out.println(OrderAgnostic(arr, target));
    }

    static int OrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean check = arr[start] < arr[end];
        while (start <= end) {
            int mid = end + ((start - end) / 2);
            if (arr[mid] == target){
                return mid;
            }
            if (check) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;

    }
}
