package com.himanshu;

public class SearchStrings {
    public static void main(String[] args) {
        String name = "Himanshu";
        char t = 'u';
        System.out.println(search(name, t));
    }

    static boolean search(String str, char t) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (t == str.charAt(i))
                return true;
        }

        return false;
    }
}
