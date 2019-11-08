package com.tobias.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class CatalogCourseComponent implements CatalogComponent {

  private final List<CatalogComponent> list = new ArrayList<>();
  private String name;
  private Integer level;

  @Override
  public Integer getLevel() {
    return this.level;
  }

  public CatalogCourseComponent(String name, Integer level) {
    this.name = name;
    this.level = level;
  }

  @Override
  public void add(CatalogComponent catalogComponent) {
    list.add(catalogComponent);
  }

  @Override
  public void remove(CatalogComponent catalogComponent) {
    list.remove(catalogComponent);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void print() {
    System.out.println("目录 : " + name);
    for (CatalogComponent catalogComponent : list) {
      if (this.getLevel() != null) {
        for (int i = 0; i < this.getLevel(); i++) {
          System.out.print("    ");
        }
      }
      catalogComponent.print();
    }
  }
}
