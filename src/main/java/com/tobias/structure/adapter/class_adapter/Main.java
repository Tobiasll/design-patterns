package com.tobias.structure.adapter.class_adapter;

public class Main {

  public static void main(String[] args) {
    Target concreteTarget = new ConcreteTarget();
    concreteTarget.require();
    Target target = new Adapter();
    target.require();
  }
}
