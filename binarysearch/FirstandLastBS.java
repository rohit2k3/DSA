package com.binarysearch;


import java.util.Arrays;

public class FirstandLastBS {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 6, 6, 6};
        int target = 4;
        System.out.println(Arrays.toString(FirstandLast(Arr, target)));
    }
    static int[] FirstandLast(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = Search(arr,target,false);
        ans[1] = Search(arr,target,true);
        return ans;
    }

    static int Search(int[] arr, int target, boolean check) {
        int start = 0;
        int ans = -2;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (check) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }
}
