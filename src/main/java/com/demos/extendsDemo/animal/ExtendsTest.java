package com.demos.extendsDemo.animal;

public class ExtendsTest {

    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = new Dog();
        System.out.println(animal.name);
        System.out.println(dog.name);

        animal.nonStaticPrint();
        dog.nonStaticPrint();
    }
}
