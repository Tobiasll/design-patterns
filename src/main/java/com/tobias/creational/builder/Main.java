package com.tobias.creational.builder;

import com.tobias.creational.builder.Animal.AnimalBuilder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Animal animal = new AnimalBuilder().setName("as").setType(1).build();
    System.out.println(animal);
    Random random = new Random();
    int i = random.nextInt(9999);
    double v = Math.random() * 9000 + 1000;
    System.out.println(v);
    System.out.println(i);
    String format = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")).substring(2) + random.nextInt(9999);
    System.out.println(format);

  }
}
