package com.tobias.structure.proxy.static_proxy;

public class Main {

  public static void main(String[] args) {
    IUserDao userDao = new UserDaoImplProxy(new UserDaoImpl());
    userDao.sava("test");
  }

}
