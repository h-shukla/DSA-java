package com.himanshu;

public class Leet34 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 9, 21, 33};
        int[] result = searchRange(arr, 7);
        System.out.println(result);
    }

    //  Find First and Last Position of Element in Sorted Array
    // Binary Search then get first element while going to the left and last element while going to right
    static int[] searchRange(int[] nums, int target) {
        // if the target is greater than the last element in the array return -1
        if(target > nums[nums.length-1]) {
            return new int[]{-1, -1};
        }

        int start = 0;
        int end = nums.length - 1;

        int firstOccurrence=-1, lastOccurrence=-1;

        while (start<=end) {
            // find middle element
            // start+end/2 might exceed integer value limit. so below code is more efficient
            int mid = start + (end-start)/2;

            if (target < nums[mid]) {
                if (mid-1 == target) {
                    end = mid - 2;
                    lastOccurrence = end;
                } else {
                    end = mid-1;
                    lastOccurrence = end;
                }
            } else if (target > nums[mid]) {
                if (mid+1 == target) {
                    start = mid+2;
                    firstOccurrence = end;
                }
                else {
                    start = mid+1;
                    firstOccurrence = end;
                }
            } else {
                return new int[] {nums[firstOccurrence], nums[lastOccurrence]};
            }
        }
        return new int[] {-1, -1};
    }
}
