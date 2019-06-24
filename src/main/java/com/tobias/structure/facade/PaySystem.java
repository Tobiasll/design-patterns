package com.tobias.structure.facade;

public class PaySystem {

  public boolean payByPoint(boolean hasSurplusGift) {
    if (hasSurplusGift) {
      System.out.println("pay it ...");
      return hasSurplusGift;
    }
    System.out.println("can't pay it");
    return hasSurplusGift;
  }

}
