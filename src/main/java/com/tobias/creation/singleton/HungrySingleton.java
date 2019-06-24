package com.tobias.creation.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

  private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

  private HungrySingleton() {
  }

  public static HungrySingleton getHungrySingleton() {
    return HUNGRY_SINGLETON;
  }



}
