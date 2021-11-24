package com.himanshu;

public class CeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,12};
        int ceil = binaryCeil(arr, 6);
        int floor = binaryFloor(arr, 6);
        System.out.println("If -1 then, the ceil/floor of number doesn't exist in array");
        System.out.print("The ceil index is: ");
        System.out.println(ceil);
        System.out.print("The floor index is: ");
        System.out.println(floor);
    }

    // ceil with linear search O(n)
    static int linearCeil(int[] arr, int ceilNo) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] >= ceilNo) {
                return i;
            }
        }
        return -1;
    }

    // Ceil with binary search o(1)
    // smallest no >= target
    static int binaryCeil(int[] arr, int ceilNo) {
        int start = 0;
        int end = arr.length - 1;
        if (ceilNo > arr[end]) {
            return -1;
        }
        while (start<=end) {
            // find middle element
            // start+end/2 might exceed integer value limit. so below code is more efficient
            int mid = start + (end-start)/2;

            if (ceilNo < arr[mid]) {
                end = mid-1;
            } else if (ceilNo > arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return start;
    }

    // Floor of number with binary search
    // return the greatest no <= target
    static int binaryFloor(int[] arr, int floorNo) {
        int start = 0;
        int end = arr.length - 1;
        if (floorNo < arr[start]) {
            return -1;
        }
        while (start<=end) {
            // find middle element
            // start+end/2 might exceed integer value limit. so below code is more efficient
            int mid = start + (end-start)/2;

            if (floorNo < arr[mid]) {
                end = mid-1;
            } else if (floorNo > arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
