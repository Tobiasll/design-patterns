package com.tobias.structure.proxy.static_proxy;

public class UserDaoImpl implements IUserDao {

  @Override
  public int sava(String user) {
    System.out.println("insert object： " + user);
    return Math.random() / 2 == 1 ? 0 : 1;
  }
}
