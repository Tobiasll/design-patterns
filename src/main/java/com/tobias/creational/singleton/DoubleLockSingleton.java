package com.tobias.creational.singleton;

import java.io.Serializable;

public class DoubleLockSingleton implements Serializable, Cloneable {

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
   * 防止原型模式拷贝对象破坏对象的单例性
   */
  @Override
  protected Object clone() throws CloneNotSupportedException {
//    return super.clone();
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
