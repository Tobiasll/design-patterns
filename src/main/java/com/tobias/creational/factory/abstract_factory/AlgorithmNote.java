package com.tobias.creational.factory.abstract_factory;

public class AlgorithmNote implements Note {

  @Override
  public void produce() {
    System.out.println("AlgorithmNote produce");
  }
}
