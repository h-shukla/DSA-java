package com.himanshu;

public class Main {
    /*
     * Linear search is the most basic of all the searching algorithm
     * It's worst case time is O(n) where n is the length of array
     * It's best case time is O(1) where 1 is the first element of the array
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,99};
        int t = 99;
        int ans = linearSearch(arr, t);
        int ans2 = linearSearch2(arr, t);
        System.out.println("It is in the index "+ans);
        System.out.println("The element is "+ans2);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            // element is the ith element of arr
            int element = arr[i];
            if (element == target)
                return i;
        }
        return -1;
    }

    // returning the element
    static int linearSearch2(int[] arr, int target) {
        for(int element: arr) {
            if (element==target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // method that returns boolean
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0)
            return false;

        for (int i = 0; i < arr.length; i++) {
            // element is the ith element of arr
            int element = arr[i];
            if (element == target)
                return true;
        }
        return true;
    }
}
