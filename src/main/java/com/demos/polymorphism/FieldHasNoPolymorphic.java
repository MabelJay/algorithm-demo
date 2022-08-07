package com.demos.polymorphism;

public class FieldHasNoPolymorphic {

    static class Father {
        public int money = 1;

        public Father() {
            money = 2;
            System.out.println("Father's constructor");
            showMeTheMoney();
        }

        public void showMeTheMoney() {
            System.out.println("I am father, I have $" + money);
        }
    }

    static class Son extends Father {
        public int money = 3;

        public Son() {
            money = 4;
            System.out.println("Son's constructor");
            showMeTheMoney();
        }

        public void showMeTheMoney() {
            System.out.println("I am son, I have $" + money);
        }
    }

    public static void main(String[] args) {
        Father guy = new Son();
        System.out.println("This guy has $" + guy.money);
    }
}
