package com.tobias.flyweight.flyweight_impl_cpp.impl;

import com.tobias.flyweight.flyweight_impl_cpp.Flyweight;

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
