package com.himanshu;
/*
 * To count digits in a number, take a variable=0, and divide the number by 10 while increasing the variable
 * That will give the number of digits.
 *
 * Or convert num to string, count string.length
 */

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbersWithEvenDigits(arr));
    }

    static int findNumbersWithEvenDigits (int[] nums) {
        int count=0;
        for(int num: nums){
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check number of digits even or not
    static boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits%2==0;
    }

    // count number of digits
    static int digits(int num) {
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
