package com.tobias.structure.adapter.class_adapter;

/**
 * 类适配器采用继承的方式实现
 */
public class Adapter extends Adoptee implements Target {

  @Override
  public void require() {
    System.out.println("run adapter");
    adopteeAequire();
  }
}
