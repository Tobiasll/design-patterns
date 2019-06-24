package com.tobias.structure.adapter.objcet_adapter;

/**
 * 对象适配器采用了组合形式调用
 */
public class Adapter implements Target {

  private Adaptee adaptee = new Adaptee();

  @Override
  public void require() {
    adaptee.adapteeRequire();
  }
}
