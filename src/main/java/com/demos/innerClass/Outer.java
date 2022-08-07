package com.demos.innerClass;

public class Outer {

    String name = "outer";

    class Inner {
        String name = "inner";

        public void testInner() {
            System.out.println(this.name);
            System.out.println(Outer.this.name);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.name);

        Outer.Inner inner = outer.new Inner();
        inner.testInner();
    }
}
