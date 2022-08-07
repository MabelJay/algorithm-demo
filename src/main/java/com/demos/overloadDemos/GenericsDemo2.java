package com.demos.overloadDemos;

public class GenericsDemo2 {

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 128;
        Integer f = 128;

        Integer h = Integer.valueOf(128);
        Integer i = Integer.valueOf(128);
        Long g = 3L;

        System.out.println(h == i);
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));

        System.out.println(a instanceof Integer);
    }
}
