package com.tobias.structure.decorate;

public class MeatDecorate extends GarnishDecorate {

  private Humburger humburger;

  public MeatDecorate(Humburger humburger) {
    super(humburger);
    this.humburger = humburger;
  }

  @Override
  public String getDescription() {
    return humburger.getDescription() + " and add meat";
  }

  @Override
  public Integer getCost() {
    return humburger.getCost() + 10;
  }
}
