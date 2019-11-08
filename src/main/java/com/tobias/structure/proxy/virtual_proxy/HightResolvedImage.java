package com.tobias.structure.proxy.virtual_proxy;

import java.net.URL;

public class HightResolvedImage implements Image {

  private URL url;
  private long startTime;
  private double hight;
  private double width;

  public HightResolvedImage(URL url) {
    this.url = url;
    this.startTime = System.currentTimeMillis();
    this.hight = 600;
    this.width = 600;
  }

  public double getHight() {
    return hight;
  }

  public double getWidth() {
    return width;
  }

  public boolean isLoad() {
    return System.currentTimeMillis() - startTime > 3000;
  }

  @Override
  public void showImage() {
    System.out.printf("this is real ImageURL %s\n", url);
  }
}
