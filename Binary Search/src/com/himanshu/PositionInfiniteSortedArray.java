package com.himanshu;

// Finding position of element in an infinite sorted array
// make random slots and increase those if element not found so first slot
// could be of 6 elements, if not found in that slot increase it to 12 & so on
public class PositionInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // first find the range
        // first start with box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            // new variable as we need the old value below
            int temp = end + 1;
            // end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    // basic binary search
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start<=end) {
            int mid = start + (end-start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
