package com.himanshu;

public class Arr {
    public static void main(String[] args) {
        // Q: store 5 roll no and names
        int[] rollno = {1,2,3,4,5};
        String[] names = {"alpha", "beta", "gamma", "delta", "penta"} ;
        for (int i=0; i<rollno.length; i++) {
            System.out.println(names[i] + " " + rollno[i] + " ");
        }
    }
}
