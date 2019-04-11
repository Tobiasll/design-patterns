package com.tobias.adapter;

public class Client {

  public static void main(String[] args) {
    Turkey turkey = new WildTurkey();
    turkey.gobble();
    Duck duck = new DuckAdapter(turkey);
    duck.quack();
  }
}
