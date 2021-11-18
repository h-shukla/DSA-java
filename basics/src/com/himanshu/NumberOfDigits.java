package com.himanshu;

public class NumberOfDigits {
    public static void main(String[] args) {
        // always remainder of n when divided by 10 will give you last digit of the current number
        // so n%10 i.e. 134%10=4, 13%10=3, and so on...
        int n = 1385757879;
        int count=0;
        while (n>0) {
            int rem = n%10;
            if (rem == 7) {
                count++;
            }
            n = n/10;
        }

        System.out.println(count);
    }
}
