package com.tobias.behavior.observer;

import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Course course = new Course("course1",
        Collections.singletonList(new Question("question1", "content1")));
    Teacher teacher1 = new Teacher("teacher1");
    Teacher teacher2 = new Teacher("teacher2");
    // 观察者集合会被反序遍历
    course.addObserver(teacher2);
    course.addObserver(teacher1);
    course.call();

  }
}
