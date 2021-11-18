package com.himanshu;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter value in C: ");
        float celcius = input.nextFloat();
        float fahrenheit = (celcius * 9/5) + 32;
        System.out.println("Temperature in fahrenheit is " + fahrenheit);
    }
}
