package com.tobias.structure.bridge;

public class SavingAccount implements Account {

  @Override
  public String getType() {
    return "savingAccount";
  }

  @Override
  public String peakMoney() {
    return "100.12$";
  }
}
