package com.tobias.creational.factory.factory_method;

public class DogFactory implements AnimalFactory {

  @Override
  public Animal getInstance() {
    return new Dog();
  }
}
