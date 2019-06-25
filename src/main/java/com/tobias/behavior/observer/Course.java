package com.tobias.behavior.observer;

import java.util.List;
import java.util.Observable;

public class Course extends Observable {

  private String name;
  private List<Question> questions;

  public Course(String name, List<Question> questions) {
    this.name = name;
    this.questions = questions;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }

  @Override
  public String toString() {
    return "Course{" +
        "name='" + name + '\'' +
        ", questions=" + questions +
        '}';
  }

  public void call() {
    System.out.println(this + " ::call !");
    // 打开通知开关设为true，可通知该被观察者（Course）对应的所有观察者（Teacher）
    setChanged();
    // 开始通知所有的观察者（Teacher）的 update 方法，将Vector转为Object数组后调用clearChanged()将changed设为false,
    // 反序遍历数组并讲Object强转为Observer对象调用update方法
    notifyObservers(1);

  }


}
