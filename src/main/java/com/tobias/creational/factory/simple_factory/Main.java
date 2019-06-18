package com.tobias.creational.factory.simple_factory;

public class Main {

  public static void main(String[] args) {
    Animal dog = AnimalFactory.createAnimal(Dog.class, "doccc");
    dog.running();
    System.out.println(dog.getName());
    System.out.println(dog.runAndGetInstanceClassName());

  }
}
