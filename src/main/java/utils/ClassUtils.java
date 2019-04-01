package utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;

public class ClassUtils {

  public static ArrayList<Class> getAllClassByInterface(Class clazz) {
    ArrayList<Class> list = new ArrayList<>();

    // 判断是否是一个接口
    if (clazz.isInterface()) {
      getSubClass(clazz, list);
    } else {
      // 如果不是接口，则获取它的所有子类
      getSubClass(clazz, list);
    }
    return list;
  }

  private static void getSubClass(Class clazz, ArrayList<Class> list) {
    try {
      ArrayList<Class> allClass = getAllClass(clazz.getPackage().getName());

      for (Class allClass1 : allClass) {
        if (clazz.isAssignableFrom(allClass1)) {
          if (!clazz.equals(allClass1)) {
            list.add(allClass1);
          }
        }
      }
    } catch (Exception e) {
      System.out.println("出现异常 : " + e.getMessage());
    }
  }

  /**
   * 从一个指定路径下查找所有的类
   */
  @SuppressWarnings("rawtypes")
  private static ArrayList<Class> getAllClass(String packagename) {
    ArrayList<Class> list = new ArrayList<>();
    // 返回对当前正在执行的线程对象的引用。
    // 返回该线程的上下文 ClassLoader。
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    String path = packagename.replace('.', '/');
    try {
      ArrayList<File> fileList = new ArrayList<>();
      Enumeration<URL> enumeration = classLoader.getResources(path);
      while (enumeration.hasMoreElements()) {
        URL url = enumeration.nextElement();
        fileList.add(new File(url.getFile()));
      }
      for (File file : fileList) {
        list.addAll(findClass(file, packagename));
      }
    } catch (IOException e) {
      System.out.println("出现异常 : " + e.getMessage());
    }
    return list;
  }

  /**
   * 如果file是文件夹，则递归调用findClass方法，或者文件夹下的类 如果file本身是类文件，则加入list中进行保存，并返回
   */
  private static ArrayList<Class> findClass(File file, String packagename) {
    ArrayList<Class> list = new ArrayList<>();
    if (!file.exists()) {
      return list;
    }
    // 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
    File[] files = file.listFiles();
    assert files != null;
    for (File file2 : files) {
      if (file2.isDirectory()) {
        if (!file2.getName().contains(".")) {
          ArrayList<Class> arrayList = findClass(file2, packagename + "." + file2.getName());
          list.addAll(arrayList);
        }
      } else if (file2.getName().endsWith(".class")) {
        try {
          // 保存的类文件不需要后缀.class
          list.add(Class.forName(packagename + '.' + file2.getName().substring(0, file2.getName().length() - 6)));
        } catch (ClassNotFoundException e) {
          System.out.println("出现异常 : " + e.getMessage());
        }
      }
    }
    return list;
  }
}
