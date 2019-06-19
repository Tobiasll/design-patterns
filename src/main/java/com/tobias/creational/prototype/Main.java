package com.tobias.creational.prototype;

import java.util.List;

public class Main {

  public static void main(String[] args) throws Exception {
   Prototype prototype = new Prototype("test");
    Prototype clone = (Prototype) prototype.clone();
    List<Object> list = prototype.getList();
    list.clear();
    prototype.setList(list);
    System.out.println(prototype);
    System.out.println(clone);
    System.out.println(clone.getList());

  }
}
