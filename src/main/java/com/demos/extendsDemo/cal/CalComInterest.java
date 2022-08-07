package com.demos.extendsDemo.cal;

public class CalComInterest {

    public static void main(String[] args) {
        System.out.println(Math.pow(1.1, 1.28));
        System.out.println(new CalComInterest().calComInterest(1.3, 5));
    }

    public double calComInterest(double result, double year) {
        double res = Math.pow(result, 1 / year) - 1;
        return res;
    }
}
