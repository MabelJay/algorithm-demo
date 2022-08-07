package com.demos.innerClass;

public class SonImplementation {

    FatherInterface fatherInterface;
    FatherClass fatherClass;

    public SonImplementation(FatherInterface fatherInterface) {
        this.fatherInterface = fatherInterface;
    }

    public SonImplementation(FatherClass fatherClass) {
        this.fatherClass = fatherClass;
    }

    public static void main(String[] args) {
        SonImplementation sonImplementation = new SonImplementation(new FatherInterface() {
            @Override
            public int test() {
                return -1;
            }
        });

        System.out.println(sonImplementation.fatherInterface.test());


        SonImplementation sonImplementation1 = new SonImplementation(new FatherClass() {
            @Override
            public int test() {
                return 1;
            }
        });
        System.out.println(sonImplementation1.fatherClass.test());
    }
}
