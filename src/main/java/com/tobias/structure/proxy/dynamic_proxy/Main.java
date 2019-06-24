package com.tobias.structure.proxy.dynamic_proxy;

import com.tobias.structure.proxy.static_proxy.IUserDao;
import com.tobias.structure.proxy.static_proxy.UserDaoImpl;

public class Main {

  public static void main(String[] args) {
    UserDaoProxyFactory userDaoProxyFactory = new UserDaoProxyFactory(new UserDaoImpl());

    // 只是获取对象，并不会触发InvocationHandler().invoke()方法
    IUserDao userDao = userDaoProxyFactory.getAfterObjcetByDynamicProxy();
    // 调用方法时才开始执行代理的目标对象方法
    userDao.sava("test");
  }
}
