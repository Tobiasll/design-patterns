package com.tobias.structure.proxy.static_proxy;

/**
 * 这种代理方式需要代理对象和目标对象实现一样的接口。
 *
 * 优点：可以在不修改目标对象的前提下扩展目标对象的功能。
 *
 * 缺点： 冗余。由于代理对象要实现与目标对象一致的接口，会产生过多的代理类。 不易维护。一旦接口增加方法，目标对象与代理对象都要进行修改。
 */
public class UserDaoImplProxy implements IUserDao {

  private IUserDao iUserDao;

  public UserDaoImplProxy(IUserDao iUserDao) {
    this.iUserDao = iUserDao;
  }

  @Override
  public int sava(String user) {
    before();
    int sava = iUserDao.sava(user);
    after();
    return sava;
  }

  private void before() {
    System.out.println("open the transaction!");
  }

  private void after() {
    System.out.println("close the transaction!");
  }
}
