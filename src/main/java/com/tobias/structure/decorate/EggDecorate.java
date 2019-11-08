package com.tobias.structure.decorate;

public class EggDecorate extends GarnishDecorate {

  private Humburger humburger;

  public EggDecorate(Humburger humburger) {
    super(humburger);
    this.humburger = humburger;
  }

  @Override
  public String getDescription() {
    return humburger.getDescription() + " and add egg";
  }

  @Override
  public Integer getCost() {
    return humburger.getCost() + 1;
  }
}
