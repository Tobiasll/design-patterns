package com.tobias.behavior.mediator;

public class Alarm implements Colleague {

  @Override
  public void onEvent(Mediator mediator) {
    mediator.doEvent("alarm");
  }


  public void doAlarm() {
    System.out.println("doAlarm()");
  }
}
