package com.company;

public class Main {

    public static void main(String[] args) {

        Cat soya = new Cat("Soya");
        Cat nusse = new Cat ("Nusse");
        Dog topsy = new Dog("Topsy");
        Dog balder = new Dog("Balder");

        System.out.print(soya.name);
        soya.makeSound();
        soya.eat("fish");
        soya.showMood(true);

        System.out.print(nusse.name);
        nusse.showMood(false);

        System.out.println(topsy.name);
        topsy.makeSound();
        topsy.eat("dogfood");
        topsy.showMood(false);

        System.out.println(balder.name);
        balder.showMood(true);
    }
}
