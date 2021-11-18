package com.himanshu;

import java.util.Arrays;

public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target=18;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(maxNum(arr));
    }

    static int[] search(int[][] arr, int t) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == t)
                    return new int[]{row, col};
            }
        }
        return new int[] {-1};
    }

    static int maxNum(int[][] arr) {
        int max=Integer.MIN_VALUE;
        for (int[] ints:arr) {
            for(int anInt: ints) {
                if (anInt > max)
                    max = anInt;
            }
        }
        return max;
    }
}
