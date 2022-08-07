package com.demos.jvm;

public class RuntimeConstantPool {

    public static void main(String[] args) {
        String str1 = new StringBuilder("computer").append("science").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);

        ClassLoader classLoader = RuntimeConstantPool.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
