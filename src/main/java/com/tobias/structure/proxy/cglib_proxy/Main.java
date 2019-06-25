package com.tobias.structure.proxy.cglib_proxy;

import com.tobias.structure.proxy.static_proxy.IUserDao;
import com.tobias.structure.proxy.static_proxy.UserDaoImpl;

public class Main {

  public static void main(String[] args) {
    UserDaoProxyFactory userDaoProxyFactory = new UserDaoProxyFactory(new UserDaoImpl());
    IUserDao proxyInstance = (IUserDao) userDaoProxyFactory.getProxyInstance();
    proxyInstance.sava("call");
  }
}
