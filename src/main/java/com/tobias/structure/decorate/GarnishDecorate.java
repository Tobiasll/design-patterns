package com.tobias.structure.decorate;

public abstract class GarnishDecorate implements Humburger {

  private Humburger humburger;

  public GarnishDecorate(Humburger humburger) {
    this.humburger = humburger;
  }


}
