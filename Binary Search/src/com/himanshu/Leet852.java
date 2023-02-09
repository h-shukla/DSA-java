package com.himanshu;

// Peak index in a mountain array.
// mountain array continuously increases and goes up to a max point then it goes down again also it doesn't contain any
// duplicate element

// so we have to find the maximum number of the array
public class Leet852 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 8, 6, 4, 2, 0};
        System.out.println(arr[peakIndexInMountainArray(arr)]);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<end) {
            int mid = start + (end-start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in decreasing part of array
                // this may be the ans but look at left
                // this is why end != mid-1
                end = mid;
            } else {
                // you are in ascending part of array
                start = mid + 1;
            }
        }
        // start == end and pointing to the largest number because of the two checks above
        return start; // or return end as both are equal
    }

}
