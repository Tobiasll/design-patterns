package com.tobias.structure.decorate;

public class AngusBurger implements Humburger {

  @Override
  public String getDescription() {
    return "this is angusburger";
  }

  @Override
  public Integer getCost() {
    return 15;
  }
}
