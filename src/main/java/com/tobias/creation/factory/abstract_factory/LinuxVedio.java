package com.tobias.creation.factory.abstract_factory;

public class LinuxVedio implements Vedio {

  @Override
  public void produce() {
    System.out.println("LinuxVedio produce");
  }
}
