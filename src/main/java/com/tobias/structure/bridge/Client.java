package com.tobias.structure.bridge;

public class Client {

  public static void main(String[] args) {
    Bank ICBCBank = new ICBCBank(new SavingAccount());
    ICBCBank.showAccountMoney();
    ICBCBank.showAccountType();

    Bank ICBCBank2 = new ICBCBank(new DepositedAccount());
    ICBCBank2.showAccountMoney();
    ICBCBank2.showAccountType();
  }
}
