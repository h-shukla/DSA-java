package com.himanshu;

public class Reverse {
    public static void main(String[] args) {
        int n = 123456;
        int ans = 0;
        // same logic as NumberOfDigits just if we multiply n by 10 and add remainder we can literally attach one number with another
        while (n>0) {
            int rem = n%10;
            if (rem>0){
                ans = ans*10+rem;
            }
            n = n/10;
        }

        System.out.println(ans);
    }
}
