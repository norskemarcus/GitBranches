package com.company;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  public void makeSound(){
    System.out.println("Mjau");
  }

  public boolean eat(String foodType){
    return true;
  }

}
