package com.tobias.structure.facade;

public class CheckSystem {

  public boolean isResidue(PointGift gift) {
    if ("milk".equals(gift.getName())) {
      System.out.println("the gift has surplus stock! ");
      return true;
    }
    System.out.println("the gift hasn't surplus stock! ");
    return false;
  }

}
