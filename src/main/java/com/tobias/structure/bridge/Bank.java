package com.tobias.structure.bridge;


/**
 * 将抽象与实现分离开来，使它们可以独立变化。 符合迪米特原则（最少知道） 开闭原则（对拓展开放，对修改关闭）
 */
public abstract class Bank {

  protected Account account;

  public Bank(Account account) {
    this.account = account;
  }

  public abstract void showAccountType();

  public abstract void showAccountMoney();
}
