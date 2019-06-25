package com.tobias.behavior.memento;

import java.util.Stack;

/**
 * 核心类管理
 */
public class CourseMementoManager {

  public final static Stack<CourseMemento> COURSE_MEMENTOS = new Stack<>();

  public static void addCourseMemento(CourseMemento courseMemento) {
    COURSE_MEMENTOS.push(courseMemento);
  }

  public static CourseMemento popCourseMemento() {
    return COURSE_MEMENTOS.pop();
  }

  public static Stack<CourseMemento> getCourseMementos() {
    return COURSE_MEMENTOS;
  }
}
