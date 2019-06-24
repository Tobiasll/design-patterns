package com.tobias.creation.factory.abstract_factory;

public class LinuxFactory implements CourseFactory {

  @Override
  public Vedio getVedio() {
    return new LinuxVedio();
  }

  @Override
  public Note getNote() {
    return new LinuxNote();
  }
}
