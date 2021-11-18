package com.himanshu;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {12,3,424,535,1231};
        int target=535, start=1, stop=1231;
        System.out.println("Element found at index " + search(arr, target, start, stop));
    }

    static int search(int[] arr,int target,int start,int stop) {
        if(arr.length==0) {
            return -1;
        }

        for (int i = start; i < stop; i++) {
            int found = arr[i];
            if(found==target)
                return i;
        }
        return -1;
    }
}
