package com.tobias.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

  public static void main(String[] args) throws Exception {
//    enumTest();
    doubleLockTest();
//    hungryTest();
//    staticInnerClassSingletonTest();
  }

  private static void staticInnerClassSingletonTest() throws Exception {
    StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
    System.out.println(staticInnerClassSingleton);
    StaticInnerClassSingleton o = (StaticInnerClassSingleton) serializableAttack(staticInnerClassSingleton);
    System.out.println(o);
    StaticInnerClassSingleton o1 = (StaticInnerClassSingleton) reflectAttack(staticInnerClassSingleton.getClass());
    System.out.println(staticInnerClassSingleton == o);
    System.out.println(o1);
    System.out.println(staticInnerClassSingleton == o1);
  }

  private static void hungryTest() throws Exception {
    HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();
    System.out.println(hungrySingleton);
    HungrySingleton o = (HungrySingleton) serializableAttack(hungrySingleton);
    System.out.println(o);
    System.out.println(hungrySingleton == o);
    HungrySingleton o1 = (HungrySingleton) reflectAttack(hungrySingleton.getClass());
    System.out.println(o1);
    System.out.println(hungrySingleton == o1);
  }


  private static void doubleLockTest() throws Exception {
    //内部处理了序列化破坏
    DoubleLockSingleton doubleLockSingleton = DoubleLockSingleton.getInstance();
    DoubleLockSingleton o = (DoubleLockSingleton) serializableAttack(doubleLockSingleton);
    System.out.println(doubleLockSingleton);
    System.out.println(o);
    System.out.println(doubleLockSingleton == o);

    DoubleLockSingleton o1 = (DoubleLockSingleton) reflectAttack(doubleLockSingleton.getClass());
    System.out.println(o1);
    System.out.println(doubleLockSingleton == o1);

    DoubleLockSingleton o2 = (DoubleLockSingleton) reflactCloneMethodAttack(doubleLockSingleton.getClass());
    System.out.println(o2);
    System.out.println(doubleLockSingleton == o2);
  }

  private static void enumTest() throws Exception {
    EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
    System.out.println(enumSingleton.getObject());
    System.out.println(enumSingleton.countingRandomSameNumber());
    System.out.println(enumSingleton.getListSize());
    System.out.println(enumSingleton.cleanList());
    System.out.println(enumSingleton.countingRandomSameNumber());
    System.out.println(enumSingleton.getListSize());
    EnumSingleton obj = (EnumSingleton) serializableAttack(enumSingleton);
    System.out.println(enumSingleton == obj);

    EnumSingleton o = (EnumSingleton)reflactEnumAttack(enumSingleton.getClass());
    System.out.println(o);
    System.out.println(enumSingleton == o);

  }

  private static Object serializableAttack(Object o) throws Exception {
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("test")));
    oos.writeObject(o);

    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("test")));
    return ois.readObject();

  }

  private static Object reflectAttack(Class clazz) throws Exception {
    Constructor declaredConstructor = clazz.getDeclaredConstructors()[0];
    declaredConstructor.setAccessible(true);
    return declaredConstructor.newInstance();
  }

  private static Object reflactEnumAttack(Class clazz) throws Exception {
    Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
    declaredConstructor.setAccessible(true);
    return declaredConstructor.newInstance("tobias", 1);
  }

  private static Object reflactCloneMethodAttack(Class clazz) throws Exception {
    Method clone = clazz.getDeclaredMethod("clone");
    clone.setAccessible(true);
    Constructor declaredConstructor = clazz.getDeclaredConstructor();
    declaredConstructor.setAccessible(true);
    return clone.invoke(declaredConstructor.newInstance());
  }



}
