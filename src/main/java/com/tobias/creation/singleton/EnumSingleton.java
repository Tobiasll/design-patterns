package com.tobias.creation.singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum EnumSingleton implements Serializable,Cloneable {
  /**
   *
   */
  INSTANCE {

    private final Random RANDOM = new Random();

    private final List<Integer> list = new ArrayList<>();


     @Override
     public int countingRandomSameNumber() {
       int count = 0;

      for (int i = 0; i < 1000; i++) {
        int number = RANDOM.nextInt(9999);
        while (list.contains(number)) {
          count++;
          list.add(number + 99999);
          number = RANDOM.nextInt(9999);
        }
        list.add(number);
      }
      return count;

    }

    @Override
    public int getListSize() {
       return list.size();
    }

    @Override
    public int cleanList() {
       list.clear();
       return list.size();
    }

  };

  public abstract int countingRandomSameNumber();

  public abstract int getListSize();

  public abstract int cleanList();

  {
    object = new Object();
  }

  private Object object;


  public Object getObject() {
    return object;
  }




}
