package com.tobias.structure.proxy.virtual_proxy;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

  public static void main(String[] args) {
    try {
      HightResolvedImageProxy hightResolvedImageProxy = new HightResolvedImageProxy( new HightResolvedImage(new URL("http:test.png")));
      hightResolvedImageProxy.showImage();
    } catch (MalformedURLException ignored) {}
  }
}
