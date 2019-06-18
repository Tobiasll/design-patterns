package com.tobias.creational.factory.simple_factory;

import com.tobias.exception.CustomException;
import java.lang.reflect.Field;

public interface Animal {

  void running();

  default String getName()  {
    try {
      Field name = this.getClass().getDeclaredField("name");
      name.setAccessible(true);
      return name.get(this).toString();
    } catch (Exception e) {
      throw new CustomException(e.getMessage(), e, false);
    }
  }

  default String runAndGetInstanceClassName() {
    running();
    return this.getClass().getSimpleName();
  }
}
