package com.tobias.structure.composite;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    CatalogComponent arithmeticCourse = new Course("Arithmetic", 99, 0);
    CatalogComponent linuxCourse = new Course("linux", 22, 0);
    CatalogComponent computeCatalog = new CatalogCourseComponent("计算机总目录", 1);

    CatalogComponent linuxCatalog = new CatalogCourseComponent("linux目录", 2);
    linuxCatalog.add(new Course("操作系统", 22, 0));
    linuxCatalog.add(new Course("linux", 1, 0));
    linuxCatalog.add(new Course("计算机网络", 33, 0));
    linuxCatalog.add(new Course("shell", 33, 0));

    CatalogComponent javaCatalog = new CatalogCourseComponent("java目录", 2);
    javaCatalog.add(arithmeticCourse);
    javaCatalog.add(linuxCourse);
    computeCatalog.add(linuxCatalog);
    computeCatalog.add(javaCatalog);
    computeCatalog.print();

    Map<String, Object> map = new HashMap<>();
    Map<String, Object> table = new Hashtable<>();
    table.put("1", 1);
    table.put("2", 2);
    table.put("3", 3);
    table.put("4", 4);
    map.putAll(table);
    System.out.println(map);
  }
}
