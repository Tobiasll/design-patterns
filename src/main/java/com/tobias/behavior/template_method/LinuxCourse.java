package com.tobias.behavior.template_method;

public class LinuxCourse extends AbstractCourse {

  private boolean articleIsNecessary;

  public LinuxCourse(String name, boolean articleIsNecessary) {
    super(name);
    this.articleIsNecessary = articleIsNecessary;
  }

  @Override
  protected void packageResource() {
    System.out.println("packing codes");
    System.out.println("packing software");
  }

  @Override
  protected boolean articleIsNecessary() {
    return this.articleIsNecessary;
  }
}
