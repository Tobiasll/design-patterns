package com.tobias.behavior.memento;

/**
 * 被备忘对象类，拥有保存saveCourse和回滚方法undoCourseMemento
 */
public class Course {

  private String name;
  private String title;

  public Course(String name, String title) {
    this.name = name;
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Course{" +
        "name='" + name + '\'' +
        ", title='" + title + '\'' +
        '}';
  }

  public void saveCourse() {
    CourseMementoManager.addCourseMemento(new CourseMemento(this.name, this.title));
  }

  public void undoCourseMemento() {
    CourseMemento courseMemento = CourseMementoManager.popCourseMemento();
    this.name = courseMemento.getName();
    this.title = courseMemento.getTitle();
  }
}
