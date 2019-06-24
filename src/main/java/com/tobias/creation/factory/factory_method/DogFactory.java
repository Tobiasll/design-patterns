package com.tobias.creation.factory.factory_method;

public class DogFactory implements AnimalFactory {

  @Override
  public Animal getInstance() {
    return new Dog();
  }
}
