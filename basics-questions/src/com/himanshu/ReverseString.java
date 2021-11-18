package com.himanshu;

public class ReverseString {
    public static void main(String[] args) {
        String str = "himanshu";
        System.out.println(str + " is the original string");
        String newStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newStr+=str.charAt(i);
        }
        System.out.println(newStr+ " is the reversed string");
    }
}
