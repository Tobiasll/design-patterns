package com.tobias.behavior.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

  private String name;

  public Teacher(String name) {
    this.name = name;
  }

  @Override
  public void update(Observable o, Object arg) {
    System.out.println("teacher : " + name + " 被观察者对象 ： " + o + " 被观察者传来的参数 : " + arg);
  }
}
