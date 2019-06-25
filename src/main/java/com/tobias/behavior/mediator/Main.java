package com.tobias.behavior.mediator;

public class Main {

  public static void main(String[] args) {
    Alarm alarm = new Alarm();
    CoffeePot coffeePot = new CoffeePot();
    Calender calender = new Calender();
    Sprinkler sprinkler = new Sprinkler();
    ConcreteMediator concreteMediator = new ConcreteMediator(alarm, coffeePot, calender, sprinkler);
    concreteMediator.doEvent("alarm");
  }
}
