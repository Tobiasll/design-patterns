package com.tobias.behavior.mediator;

public class CoffeePot implements Colleague {

  @Override
  public void onEvent(Mediator mediator) {
    mediator.doEvent("coffeePot");
  }


  public void doCoffeePot() {
    System.out.println("doCoffeePot()");
  }
}
