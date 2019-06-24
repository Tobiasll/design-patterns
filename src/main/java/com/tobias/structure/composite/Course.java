package com.tobias.structure.composite;

public class Course implements CatalogComponent {

  private String name;
  private Integer price;
  private Integer level;

  public Course(String name, Integer price, Integer level) {
    this.name = name;
    this.price = price;
    this.level = level;
  }

  @Override
  public Integer getLevel() {
    return level;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Integer getPrice() {
    return price;
  }

  @Override
  public void print() {
    System.out.println("课程 ： " + name + " 价格 ：" + price);
  }
}
