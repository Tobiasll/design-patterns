package com.tobias.behavior.memento;

public class Main {

  public static void main(String[] args) {
    Course course = new Course("course1", "title1");
    course.saveCourse();
    course.setName("course2");
    course.setTitle("title2");
    course.saveCourse();

    CourseMementoManager.getCourseMementos().forEach(System.out::println);
    course.setName("course3");
    course.setTitle("title3");
    System.out.println(course);
    course.undoCourseMemento();
    System.out.println(course);
    CourseMementoManager.getCourseMementos().forEach(System.out::println);

  }
}
