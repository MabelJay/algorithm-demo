package com.demos.extendsDemo.cal;

import com.demos.extendsDemo.Father;
import com.demos.extendsDemo.Son;

class Father1 {
    int x = 10;

    public Father1() {
        this.print();
        this.x = 20;
    }

    public void print() {
        System.out.println("Father1,x= " + x);
    }
}

class Son1 extends Father1 {
    int x = 30;

    public Son1() {
        this.print();
        this.x = 40;
    }

    public void print() {
        System.out.println("Son.x= " + x);
    }
}

public class TestExtends {
    public static void main(String[] args) {
        Father1 f = new Son1();
        System.out.println(f.x);
    }
}
