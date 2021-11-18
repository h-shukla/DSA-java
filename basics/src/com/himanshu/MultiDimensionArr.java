package com.himanshu;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 2D array is an array of arrays
         * 1st row is an index, 2nd row is another index, and so on...
         * horizontal rows & vertical columns
         * 1 2 3
         * 4 5 6    ---> 3 rows 3 cols
         * 7 8 9
         */

//        int[][] arr = new int[3][2];     // adding rows is mandatory. cols are not.
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println(arr.length);

        int[][] arr = new int[3][3];
        for (int row=0; row<arr.length; row++) {
            // for every col in every row
            for (int col=0; col<arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // output printing like matrices
        for (int row=0; row<arr.length; row++) {
            // for each col in every row
            for (int col=0; col<arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
