package com.tobias.creation.prototype;

import com.sun.media.jfxmedia.logging.Logger;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prototype implements Cloneable {

  private List<Object> list;
  private String message = "  name : {0}  ";

  public Prototype(String name) {
    list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    this.message = MessageFormat.format(message, name);
  }

  public List<Object> getList() {
    return list;
  }

  public void setList(List<Object> list) {
    this.list = list;
  }

  public String getMessage() {
    return message;
  }


  @Override
  @SuppressWarnings("unchecked")
  protected Object clone() throws CloneNotSupportedException {
    Prototype clone = (Prototype) super.clone();
//    clone.list = new ArrayList<>(clone.list);
    try {
      // 反射调用ArrayList重点protected clone方法
      Method cloneMethod = clone.list.getClass().getDeclaredMethod("clone");
      cloneMethod.setAccessible(true);
      clone.list = (List<Object>) cloneMethod.invoke(clone.list);
    } catch (Exception e) {
      Logger.logMsg(Logger.INFO, e.getMessage());
    }
    return clone;
  }

  @Override
  public String toString() {
    return "Prototype{" +
        "list=" + list +
        message +
        '}' + super.toString().substring(super.toString().lastIndexOf('@') + 1);
  }
}
