package com.tobias.structure.decorate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(
        "D:\\develop\\java_project\\design_patterns\\src\\main\\java\\com\\tobias\\Adapter\\Client.java")));
    String str = null;

    while (bufferedReader.read() != -1) {
      System.out.print(bufferedReader.readLine());
    }


  }

  public static void testHumburger() {
    Humburger humburger = new CheeseBurger();
    humburger = new EggDecorate(humburger);
    humburger = new EggDecorate(humburger);
    humburger = new MeatDecorate(humburger);
    System.out.println(humburger.getDescription() + " : " + humburger.getCost());
  }


}
