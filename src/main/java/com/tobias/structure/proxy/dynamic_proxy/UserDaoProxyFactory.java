package com.tobias.structure.proxy.dynamic_proxy;

import com.tobias.structure.proxy.static_proxy.IUserDao;
import java.lang.reflect.Proxy;

/**
 * 动态代理利用了 JDK API，动态地在内存中构建代理对象，从而实现对目标对象的代理功能。动态代理又被称为 JDK 代理或接口代理。
 *
 * 静态代理与动态代理的区别主要在：
 *
 * 静态代理在编译时就已经实现，编译完成后代理类是一个实际的 class 文件 动态代理是在运行时动态生成的，即编译完成后没有实际的 class 文件，而是在运行时动态生成类字节码，并加载到 JVM
 * 中 特点： 动态代理对象不需要实现接口，但是要求目标对象必须实现接口，否则不能使用动态代理。
 */
public class UserDaoProxyFactory {

  private Object target;

  public UserDaoProxyFactory(Object target) {
    this.target = target;
  }

  public IUserDao getAfterObjcetByDynamicProxy() {
    return (IUserDao) Proxy.newProxyInstance(target.getClass().getClassLoader(),
        target.getClass().getInterfaces(), (proxy, method, args) -> {
          before();
          Object object = method.invoke(target, args);
          after();
          return object;
        });
  }

  private void before() {
    System.out.println("open the transaction!");
  }

  private void after() {
    System.out.println("close the transaction!");
  }
}
