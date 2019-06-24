package com.tobias.behavior.template_method;

public class Main {

  public static void main(String[] args) {
   AbstractCourse designPatternsCourse = new DesignPatternsCourse("DesignPatternsCourse") ;
   designPatternsCourse.makeCourse();

   AbstractCourse redhatCourse = new LinuxCourse("redhat course", true);
   AbstractCourse centOSCourse = new LinuxCourse("centOS course", false);
   redhatCourse.makeCourse();
   centOSCourse.makeCourse();
  }
}
