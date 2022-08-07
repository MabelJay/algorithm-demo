package com.demos.extendsDemo.string;

public class InternTest {

    public static void main(String[] args) {
        String a = "1" + "2";
        String b = "12";
        System.out.println(a == b);  // true

        String c = "c";
        String d = "abc";
        String e = "ab" + c;
        System.out.println(d == e); // false

        String f = e.intern();
        System.out.println(f == d); // true

        String s1 = "a";
        String s2 = "b";
        /*
        s1+s2的执行细节：
        StringBuilder s = new StringBuilder();
        s.append(s1);
        s.append(s2);
        s.toString()  -> 类似于new String("ab"); 但不会在字符串常量池中创建这个字符串对象
        但new String() -> 会在堆中创建一个字符串对象，然后在字符串常量池中创建一个对象 -> ldc
         */
        String s4 = s1 + s2;

        String c1 = new String("1");
        c1.intern();
        String c2 = "1";
        System.out.println(c1 == c2);  // false

        // toString()不会在字符串常量池中创建11对象，当执行intern()方法时，常量池中新创建的11字符串会复用堆中该对象的地址
        String c3 = new String("1") + new String("1");
        c3.intern();
        String c4 = "11";
        System.out.println(c3 == c4);// true
    }
}
