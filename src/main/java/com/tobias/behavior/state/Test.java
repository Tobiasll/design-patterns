package com.tobias.behavior.state;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jdk.internal.vm.annotation.Contended;


public class Test extends HashMap<String, Integer> {

  @Contended
  static class OOMObject {

    public byte[] placeholder = new byte[64 * 1024];

  }

  public static void fillHeap(int num) throws InterruptedException {

    List<OOMObject> list = new ArrayList<>();

    for (int i = 0; i < num; i++) {
      //稍作延时，令监视曲线的变化更加明显
      TimeUnit.SECONDS.sleep(1L);
      list.add(new OOMObject());
      System.out.println("test");
      System.gc();
    }
    System.gc();

  }

  public static void main(String[] args) throws Exception {
//    fillHeap(1000);
//    List<Class<?>> classes = Metaspace.createClasses();

  }

}
