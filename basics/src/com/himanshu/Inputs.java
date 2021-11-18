package com.himanshu;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Roll no: ");
        int rollno = input.nextInt();
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Your roll no is " + rollno);
        System.out.println("Hey, " + name);
    }
}
