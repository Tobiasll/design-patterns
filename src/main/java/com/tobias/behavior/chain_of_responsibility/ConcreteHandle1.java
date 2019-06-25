package com.tobias.behavior.chain_of_responsibility;

public class ConcreteHandle1 extends Handle {


  public ConcreteHandle1(Handle handle) {
    super(handle);
  }

  @Override
  public void handleRequest(Request request) {
    if (request.getName() != null) {
      System.out.println(request.getName() + " by handle ConcreteHandle1");
      if (this.getHandle() != null) {
        this.getHandle().handleRequest(request);
      }
    }
  }
}
