package com.tobias.structure.adapter.objcet_adapter;

public class PowerAV5VAdapter implements AC {

  private int num = 5;
  private AC220V ac220V = new AC220V();

  @Override
  public int outPut() {
    int i = ac220V.outPut();
    System.out.println("获取输入电流：" + i);
    System.out.println("变压器转换电流");
    System.out.println("输出电流：" + i / 44);
    return i / 44;
  }
}
