package com.himanshu;

public class Leet34 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 9, 21, 33};
        int[] result = searchRange(arr, 7);
        System.out.println("Done");
    }

    //  Find First and Last Position of Element in Sorted Array
    // Binary Search then get first element while going to the left and last element while going to right
    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1};

        // check for fist occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // returns index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
