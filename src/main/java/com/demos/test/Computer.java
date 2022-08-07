package com.demos.test;

public class Computer extends BaseItem {
    private float price;
    private String year;

    public Computer() {
    }

    public Computer(String inTime, String outTime, float price, String year) {
        this.inTime = inTime;
        this.outTime = outTime;
        this.price = price;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("inTime=" + inTime + " outTime=" + outTime + " price=" + price + " year=" + year);
    }

    public void print(String input) {
        System.out.println(input);
    }
}
