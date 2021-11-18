package com.himanshu;

public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = 'z';
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.println("The given character is a vowel");
        else
            System.out.println("The given character is a consonant");
    }
}
