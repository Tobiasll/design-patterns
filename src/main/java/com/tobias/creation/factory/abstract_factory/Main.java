package com.tobias.creation.factory.abstract_factory;

public class Main {

  public static void main(String[] args) {
    CourseFactory algorithmFactory = new AlgorithmFactory();
    Note note = algorithmFactory.getNote();
    Vedio vedio = algorithmFactory.getVedio();
    note.produce();
    vedio.produce();
  }
}
