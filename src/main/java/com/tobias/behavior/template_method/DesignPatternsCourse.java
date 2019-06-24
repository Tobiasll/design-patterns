package com.tobias.behavior.template_method;

public class DesignPatternsCourse extends AbstractCourse {

  public DesignPatternsCourse(String name) {
    super(name);
  }

  @Override
  protected void packageResource() {
    System.out.println("packing codes");
  }

  @Override
  protected boolean articleIsNecessary() {
    return true;
  }
}
