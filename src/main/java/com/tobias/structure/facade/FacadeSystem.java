package com.tobias.structure.facade;

/**
 * 提供了一个统一的接口，用来访问子系统中的一群接口，从而让子系统更容易使用。
 */
public class FacadeSystem {

  private CheckSystem checkSystem = new CheckSystem();
  private PaySystem paySystem = new PaySystem();
  private SendGiftSystem sendGiftSystem = new SendGiftSystem();

  public void buyGiftForPoint(String giftName) {
    boolean b = paySystem.payByPoint(checkSystem.isResidue(new PointGift(giftName)));
    if (b) {
      sendGiftSystem.sendGift();
    }
  }

}
