package com.tobias.creational.factory.abstract_factory;

public class LinuxNote implements Note {

  @Override
  public void produce() {
    System.out.println("LinuxNote produce");
  }
}
