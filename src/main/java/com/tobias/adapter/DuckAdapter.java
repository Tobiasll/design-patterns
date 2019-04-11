package com.tobias.adapter;

public class DuckAdapter implements Duck {

  private Turkey turkey;

  public DuckAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    turkey.gobble();
  }
}
