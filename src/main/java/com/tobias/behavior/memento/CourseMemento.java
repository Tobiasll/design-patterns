package com.tobias.behavior.memento;

/**
 * 中间类，用来暂存对象信息
 */
public class CourseMemento {

  private String name;
  private String title;

  public CourseMemento(String name, String title) {
    this.name = name;
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public String toString() {
    return "CourseMemento{" +
        "name='" + name + '\'' +
        ", title='" + title + '\'' +
        '}';
  }
}
