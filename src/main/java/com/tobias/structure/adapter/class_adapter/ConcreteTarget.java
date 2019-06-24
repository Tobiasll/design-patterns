package com.tobias.structure.adapter.class_adapter;

public class ConcreteTarget implements Target {

  @Override
  public void require() {
    System.out.println("run ConcreteTarget");
  }
}
