package com.himanshu;

// Find Smallest Letter Greater Than Target
public class Leet744 {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        // if the target is greater than the last element in the array return -1
        int start = 0;
        int end = letters.length - 1;
        while (start<=end) {
            // find middle element
            // start+end/2 might exceed integer value limit. so below code is more efficient
            int mid = start + (end-start)/2;

            if (target < letters[mid]) {
                end = mid-1;
            } else if (target > letters[mid]) {
                start = mid+1;
            }
        }
        return letters[start  % letters.length];
    }
}
