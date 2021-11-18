package com.himanshu;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter integer or 0 to quit: ");
            int n=sc.nextInt();
            if (n==0)
                break;
            sum+=n;
            count++;
        }
        float avg=(float)sum/(float)count;
        System.out.println("The average is " + avg);
    }
}
