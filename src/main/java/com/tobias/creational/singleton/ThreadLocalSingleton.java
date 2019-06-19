package com.tobias.creational.singleton;

import java.io.Serializable;

public class ThreadLocalSingleton implements Serializable {

  private final static ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_SINGLETON_THREAD_LOCAL =
      ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

  static {
    THREAD_LOCAL_SINGLETON_THREAD_LOCAL.set(new ThreadLocalSingleton());
  }

  private ThreadLocalSingleton(){}

  public static ThreadLocalSingleton getInstance() {
    return THREAD_LOCAL_SINGLETON_THREAD_LOCAL.get();
  }

}
