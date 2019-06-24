package com.tobias.structure.bridge;

public class DepositedAccount implements Account {

  @Override
  public String getType() {
    return "DepositedAccount";
  }

  @Override
  public String peakMoney() {
    return "10000$";
  }
}
