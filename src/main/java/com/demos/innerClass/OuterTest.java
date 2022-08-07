package com.demos.innerClass;

public class OuterTest {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.testInner();
    }
}
