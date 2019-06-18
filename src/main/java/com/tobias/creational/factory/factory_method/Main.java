package com.tobias.creational.factory.factory_method;

public class Main {

  public static void main(String[] args) {
    Animal dog = new DogFactory().getInstance();
    dog.run();
    AnimalFactory catFactory = () -> () -> {
      System.out.println("the cat run");
    };
    Animal cat = catFactory.getInstance();
    cat.run();
  }
}
