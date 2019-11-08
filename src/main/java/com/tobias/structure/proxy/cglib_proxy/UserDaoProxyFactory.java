package com.tobias.structure.proxy.cglib_proxy;

import com.tobias.structure.proxy.static_proxy.IUserDao;
import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 *
 */
public class UserDaoProxyFactory implements MethodInterceptor {

  private IUserDao target;

  public UserDaoProxyFactory(IUserDao userDao) {
    this.target = userDao;
  }


  @Override
  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {
    before();
    Object object = method.invoke(target, objects);
    after();
    return object;
  }

  //为目标对象生成代理对象
  public IUserDao getProxyInstance() {
    //工具类
    Enhancer en = new Enhancer();
    //设置父类
    en.setSuperclass(target.getClass());
    //设置回调函数, 会调用上方的intercept方法
    en.setCallback(this);
    //创建子类对象代理
    return (IUserDao) en.create();
  }


  private void before() {
    System.out.println("open the transaction!");
  }

  private void after() {
    System.out.println("close the transaction!");
  }
}
