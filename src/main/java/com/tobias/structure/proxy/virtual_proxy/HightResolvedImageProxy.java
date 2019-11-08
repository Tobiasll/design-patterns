package com.tobias.structure.proxy.virtual_proxy;

public class HightResolvedImageProxy implements Image {

  private HightResolvedImage hightResolvedImage;

  public HightResolvedImageProxy(HightResolvedImage hightResolvedImage) {
    this.hightResolvedImage = hightResolvedImage;
  }

  @Override
  public void showImage() {
    while (!hightResolvedImage.isLoad()) {
      System.out.printf("the image hight is %s and width is %s\n", hightResolvedImage.getHight(),
          hightResolvedImage.getWidth());
      try {
        Thread.sleep(100);
      } catch (InterruptedException ignored) {
      }
    }
    hightResolvedImage.showImage();
  }
}
