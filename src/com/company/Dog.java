package com.company;

public class Dog extends Animal{


  public Dog(String name) {
    super(name);
  }

  public void makeSound(){
    System.out.println("Vof");
  }

  public boolean eat(String foodType){
    return true;
  }


}
