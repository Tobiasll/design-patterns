package com.tobias.structure.adapter.objcet_adapter;

public class AC220V implements AC {

  private final int NUM = 220;


  @Override
  public int outPut() {
    System.out.println("输出电压：" + 220);
    return NUM;
  }

}
