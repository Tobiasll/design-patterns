package com.tobias.creational.singleton;

import java.io.Serializable;

public class DoubleLockSingleton implements Serializable {

  private static volatile DoubleLockSingleton doubleLockSingleton = null;

  private DoubleLockSingleton() {

  }

  public static DoubleLockSingleton getInstance() {
    if (doubleLockSingleton == null) {
      synchronized (DoubleLockSingleton.class) {
        if (doubleLockSingleton == null) {
          doubleLockSingleton = new DoubleLockSingleton();
        }
      }
    }

    return doubleLockSingleton;
  }


  /**
   * 防止序列化破坏
   * @return 返回当前对象的实例
   */
  private Object readResolve() {
    return doubleLockSingleton;
  }

  public static void main(String[] args) {

  }

  class T implements Runnable {

    @Override
    public void run() {
      getInstance();
    }
  }

}
