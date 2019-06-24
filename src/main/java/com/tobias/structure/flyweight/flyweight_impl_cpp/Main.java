package com.tobias.structure.flyweight.flyweight_impl_cpp;

import utils.StringUtils;

public class Main {

  public static void main(String[] args) {
    System.out.println(FlyweightType.CONCRETE_FLYWEIGHT.toString().equals("CONCRETE_FLYWEIGHT"));

    System.out.println(StringUtils.getCamelCaseStringAndToUpCase("UnsharedConcreteFlyweight"));
    FlyweightFactory flyweightFactory = new FlyweightFactory();
    Flyweight test = flyweightFactory.getFlyweight(FlyweightType.CONCRETE_FLYWEIGHT, "test");
    test.doOperation();
    Flyweight test1 = flyweightFactory.getFlyweight(FlyweightType.UNSHARE_CONCRETE_FLYWEIGHT, "test1");
    test1.doOperation();
    Flyweight test2 = flyweightFactory.getFlyweight(FlyweightType.CONCRETE_FLYWEIGHT, "test");
    test2.doOperation();
    Flyweight tes = flyweightFactory.getFlyweight(null, "tes");
    tes.doOperation();
  }



}
