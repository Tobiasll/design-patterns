package com.tobias.creation.factory.simple_factory;

import com.tobias.exception.CustomException;
import java.lang.reflect.Constructor;

public class AnimalFactory {

  public static Animal createAnimal(Class clazz,String name) {
    try {
      Constructor declaredConstructor = clazz.getDeclaredConstructors()[0];
      declaredConstructor.setAccessible(true);
      return (Animal) declaredConstructor.newInstance(name);
    } catch (Exception e) {
      throw new CustomException(e.getMessage(), e, false);
    }
  }

}
