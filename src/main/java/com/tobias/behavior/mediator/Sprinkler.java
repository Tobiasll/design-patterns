package com.tobias.behavior.mediator;

public class Sprinkler implements Colleague {

  @Override
  public void onEvent(Mediator mediator) {
    mediator.doEvent("sprinkler");
  }


  public void doSprinkler() {
    System.out.println("doSprinkler()");
  }
}
