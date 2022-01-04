package com.himanshu;

public class Ceiling {

    public static void main(String[] args) {
        int[] arr = {2,32,42,51,62,67};
        int target = 63;
        int result = ceiling(arr, target);
        System.out.println(result);
    }

    // return the index
    static int ceiling(int[] arr, int target) {
        // if the target is greater than the last element in the array return -1
        if(target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            // find middle element
            // start+end/2 might exceed integer value limit. so below code is more efficient
            int mid = start + (end-start)/2;

            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
// continue with 1:15
