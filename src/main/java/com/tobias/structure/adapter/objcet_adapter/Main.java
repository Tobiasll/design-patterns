package com.tobias.structure.adapter.objcet_adapter;


public class Main {

  public static void main(String[] args) {
    Target concreteTarget = new ConcreteTarget();
    concreteTarget.require();
    Target target = new Adapter();
    target.require();

    AC ac220 = new AC220V();
    ac220.outPut();
    AC ac5V = new PowerAV5VAdapter();
    ac5V.outPut();
  }
}
