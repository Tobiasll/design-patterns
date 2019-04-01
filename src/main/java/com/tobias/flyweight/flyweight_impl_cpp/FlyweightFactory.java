package com.tobias.flyweight.flyweight_impl_cpp;

import com.tobias.flyweight.flyweight_impl_cpp.impl.DefalutConcreteFlyweight;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import utils.ClassUtils;
import utils.StringUtils;


/**
 * @author tobias
 * @description 享元设计模式工厂对象
 * @version  1.0.0
 */
public class FlyweightFactory {

  private Map<String, Flyweight> mpFlyweight = new HashMap<>();
  private Map<String, Class> flyweightClasses = new HashMap<>();

  {
    initialization();
  }

  private void initialization() {
    ArrayList<Class> allClassByInterface = ClassUtils.getAllClassByInterface(Flyweight.class);
    for (Class aClass : allClassByInterface) {
      flyweightClasses.put(StringUtils.getCamelCaseStringAndToUpCase(aClass.getSimpleName()), aClass);
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
    } else if (mpFlyweight.get(key) == null){
      flyweight = new DefalutConcreteFlyweight(0);
      mpFlyweight.put(key, flyweight);
      return flyweight;
    }

    return mpFlyweight.get(key);
  }


}
