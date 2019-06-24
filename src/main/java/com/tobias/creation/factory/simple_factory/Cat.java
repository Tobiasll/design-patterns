package com.tobias.creation.factory.simple_factory;

public class Cat implements Animal {

  private String name;

  private Cat(String name) {
    this.name = name;
  }

  @Override
  public void running() {
    System.out.println(name + " running!");
  }
}
