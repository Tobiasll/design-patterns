package com.tobias.creational.factory.abstract_factory;

public class AlgorithmFactory implements CourseFactory {

  @Override
  public Vedio getVedio() {
    return new AlgorithmVedio();
  }

  @Override
  public Note getNote() {
    return new AlgorithmNote();
  }
}
