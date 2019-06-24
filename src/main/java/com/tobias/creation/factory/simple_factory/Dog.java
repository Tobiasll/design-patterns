package com.tobias.creation.factory.simple_factory;

public class Dog implements Animal {

  private String name;

  private Dog(String name) {
    this.name = name;
  }

  @Override
  public void running() {
    System.out.println(name + " running!");
  }
}
