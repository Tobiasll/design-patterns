package com.tobias.structure.flyweight.flyweight_impl_cpp.impl;

import com.tobias.structure.flyweight.flyweight_impl_cpp.Flyweight;

/**
 * 策略模式不安全实现
 */
public class UnsharedConcreteFlyweight implements Flyweight {

  private Integer allState;

  public UnsharedConcreteFlyweight(Integer allState) {
    this.allState = allState;
  }

  @Override
  public void doOperation() {
    System.out.println("class name : " + this.getClass().getSimpleName());
    System.out.println("object address : " +  System.identityHashCode(this));
    System.out.println("instrinsic : " + this.allState);
  }

  @Override
  public Integer changeStat(Integer state) {
    Integer temp = this.allState;
    this.allState = state;
    return temp;
  }
}
