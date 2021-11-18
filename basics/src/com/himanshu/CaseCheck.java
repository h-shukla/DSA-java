package com.himanshu;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);    // trim removes blank space and charAt(0) gives 0th term of string

        if (ch>='a' && ch<='z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
