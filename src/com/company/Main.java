package com.company;

public class Main {

    public static void main(String[] args) {

        Cat soya = new Cat("Soya");
        Dog topsy = new Dog("Topsy");

        System.out.println(soya.name);
        soya.makeSound();

        System.out.println(topsy.name);
        topsy.makeSound();
    }
}
