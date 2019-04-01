package com.tobias.flyweight.flyweight_impl_cpp.impl;

import com.tobias.flyweight.flyweight_impl_cpp.Flyweight;

public class DefalutConcreteFlyweight implements Flyweight {

  private Integer instrinsic;

  public DefalutConcreteFlyweight(Integer instrinsic) {
    this.instrinsic = instrinsic;
  }

  @Override
  public void doOperation() {
    System.out.println("class name : " + this.getClass().getSimpleName());
    System.out.println("object address : "  + System.identityHashCode(this));
    System.out.println("instrinsic : " + this.instrinsic);
  }

  @Override
  public Integer changeStat(Integer state) {
    Integer temp = this.instrinsic;
    this.instrinsic = state;
    return temp;
  }
}
