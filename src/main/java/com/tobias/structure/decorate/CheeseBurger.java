package com.tobias.structure.decorate;

public class CheeseBurger implements Humburger {

  @Override
  public String getDescription() {
    return "this is CheeseBurger ";
  }

  @Override
  public Integer getCost() {
    return 8;
  }
}
