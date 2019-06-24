package com.tobias.creation.factory.abstract_factory;

public class AlgorithmNote implements Note {

  @Override
  public void produce() {
    System.out.println("AlgorithmNote produce");
  }
}
