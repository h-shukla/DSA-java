package com.himanshu;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // this compiles fine. So it works
//        int[][] arr = {
//                {1,2,3},    // 0th index
//                {4,5},      // 1st index
//                {6,7,8,9}   // 2nd index
//        };

        // 2d array input
        int arr2[][] = new int[3][3];
        for (int row = 0; row < arr2.length; row++) {
            // arr2[row].length will give individual size of the row
            // whereas, arr2.length will give the number of rows
            // also arr2[row].length will give nullpointerexception,
            // if the initialization doesn't include number of cols
            // Solution to this problem is in ColNoFixed.java file
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = sc.nextInt();
            }
        }

        // 2d array output --> printing
        System.out.println();
        for (int row = 0; row < arr2.length; row++) {
            // arr2[row].length will give individual size of the row
            // whereas, arr2.length will give the number of rows
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();   // new line after every row
        }

        // NICER way of printing
        System.out.println();
        for (int row = 0; row < arr2.length; row++) {
            System.out.println(Arrays.toString(arr2[row]));
        }

        // printing with enhanced for loop
        System.out.println();
        for(int[] i: arr2) {
            System.out.println(Arrays.toString(i));
        }

    }
}
