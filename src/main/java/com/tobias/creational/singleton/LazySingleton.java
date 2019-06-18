package com.tobias.creational.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {

  private LazySingleton lazySingletonl;

  private LazySingleton() {}

  public synchronized LazySingleton getLazySingletonl() {
    if (lazySingletonl == null) {
      lazySingletonl = new LazySingleton();
    }
    return lazySingletonl;
  }

}
