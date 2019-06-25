package com.tobias.behavior.chain_of_responsibility;

public class Main {

  public static void main(String[] args) {
    Handle handle = new ConcreteHandle1(new ConcreteHandle2(null));
    handle.handleRequest(new Request("request1"));
  }
}
