package com.tobias.creation.singleton;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton implements Serializable {

//  private static final Map<String, Object> INSTANCES = new HashMap<>();

  private static Map<String, Object> INSTANCES = new HashMap<>();

  static {
    INSTANCES.put("1", new Thread("thread1"));
    INSTANCES.put("2", new Thread("thread2"));
    INSTANCES.put("3", new Thread("thread3"));
    INSTANCES.put("4", new Thread("thread4"));
    INSTANCES.put("5", new Thread("thread5"));
    INSTANCES.put("6", new Thread("thread6"));
  }

/*  private synchronized static void putObject(String key, Object obj) {
    if (key != null && !"".equals(key) && obj != null) {
      INSTANCES.put(key, obj);
    }
  }
  */


  private ContainerSingleton() {
    INSTANCES = Collections.unmodifiableMap(INSTANCES);
  }

  private static Object getObject(String key) {
    return INSTANCES.get(key);
  }

  public static Map<String, Object> getUnmodifiedMap() {
    return Collections.unmodifiableMap(INSTANCES);
  }


}
