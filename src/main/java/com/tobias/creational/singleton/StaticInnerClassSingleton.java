package com.tobias.creational.singleton;

import java.io.Serializable;

public class StaticInnerClassSingleton implements Serializable {

  private StaticInnerClassSingleton() {

  }

  private static class InnerClass {
    private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
  }

  public static StaticInnerClassSingleton getInstance() {
    return InnerClass.INSTANCE;
  }

  private Object readResolve() {
    return InnerClass.INSTANCE;
  }

}
