package com.himanshu;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            // this is a block
//            int a = 78;   // this block is also within the function scope that's why we can't make a again
            int c = 99;
        }
//        c = 32; this can't be accessed as the variable c is block scoped.

        // similarly, if a variable is initialized in a loop it will be loop scoped
    }

    static void random() {
        // this variable has a scope of current function
        int num = 67;
        System.out.println(num);
    }
}
