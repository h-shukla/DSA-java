package com.himanshu;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        int n=234;
        int sum=0;
        int product=1;

        while(n>0) {
            int rem = n%10;
            sum+=rem;
            product*=rem;
            n = n/10;
        }

        System.out.println(sum + " " + product);
    }
}
