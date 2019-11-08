package com.tobias.structure.flyweight.flyweight_impl_cpp;

import com.tobias.structure.flyweight.flyweight_impl_cpp.impl.DefalutConcreteFlyweight;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import utils.ClassUtils;
import utils.StringUtils;


/**
 * @author tobias
 * @version 1.0.0
 * @description 享元设计模式工厂对象、单例模式
 */
public class FlyweightFactory {

  private static Map<String, Flyweight> mpFlyweight = new HashMap<>();
  private volatile static Map<String, Class> flyweightClasses;

  {
    initialization();
  }

  private void initialization() {
    ArrayList<Class> allClassByInterface = ClassUtils.getAllClassByInterface(Flyweight.class);

    if (flyweightClasses == null) {
      synchronized (FlyweightFactory.class) {
        if (flyweightClasses == null) {
          flyweightClasses = new HashMap<>(allClassByInterface.size());
        }
      }
    }
    for (Class aClass : allClassByInterface) {
      flyweightClasses
          .put(StringUtils.getCamelCaseStringAndToUpCase(aClass.getSimpleName()), aClass);
    }
  }

  public Flyweight getFlyweight(FlyweightType type, String key) {
    Flyweight flyweight;
    if (type != null) {
      if (mpFlyweight.get(key) == null) {
        if (flyweightClasses.get(type.toString()) == null) {
          flyweight = new DefalutConcreteFlyweight(0);
          mpFlyweight.put(key, flyweight);
          return flyweight;
        }
        try {
          Class aClass = flyweightClasses.get(type.toString());
          flyweight = (Flyweight) aClass.getConstructor(Integer.class).newInstance(0);
          mpFlyweight.put(key, flyweight);
          return flyweight;
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    } else if (mpFlyweight.get(key) == null) {
      flyweight = new DefalutConcreteFlyweight(0);
      mpFlyweight.put(key, flyweight);
      return flyweight;
    }

    return mpFlyweight.get(key);
  }


}
