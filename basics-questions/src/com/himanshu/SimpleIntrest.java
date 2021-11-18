package com.himanshu;

public class SimpleIntrest {

    static void si(float principle, float time, float rate) {
        double finalAmount = principle*(1+(rate*time));
        System.out.println(finalAmount+ " is the total amount to be paid on principle amount of "
                + principle);
    }

    public static void main(String[] args) {
        float p = 10000f;
        float t = 0.08f;
        float r = 0.2708f;

        si(p,t,r);
    }
}
