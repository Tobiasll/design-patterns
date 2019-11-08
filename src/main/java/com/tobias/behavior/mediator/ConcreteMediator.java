package com.tobias.behavior.mediator;

/**
 * 核心类：：集中相关对象之间复杂的沟通和控制方式。 源码：JDK:java.util.Timer=ConcreteMediator::schedule()=doEvent(),
 * 调用核心方法sched去控制和管理TimerTask任务类执行相对应的方法, TimeTask=Alarm/CoffeePot...
 */
public class ConcreteMediator implements Mediator {

  private Alarm alarm;
  private CoffeePot coffeePot;
  private Calender calender;
  private Sprinkler sprinkler;

  public ConcreteMediator(Alarm alarm, CoffeePot coffeePot, Calender calender,
      Sprinkler sprinkler) {
    this.alarm = alarm;
    this.coffeePot = coffeePot;
    this.calender = calender;
    this.sprinkler = sprinkler;
  }

  @Override
  public void doEvent(String eventType) {
    switch (eventType) {
      case "alarm":
        doAlarmEvent();
        break;
      case "coffeePot":
        doCoffeePotEvent();
        break;
      case "calender":
        doCalenderEvent();
        break;
      default:
        doSprinklerEvent();
    }
  }

  private void doAlarmEvent() {
    alarm.doAlarm();
    doCoffeePotEvent();
  }

  private void doCoffeePotEvent() {
    coffeePot.doCoffeePot();
    doCalenderEvent();
  }

  private void doCalenderEvent() {
    calender.doCalender();
    doSprinklerEvent();
  }

  private void doSprinklerEvent() {
    sprinkler.doSprinkler();
  }

}
