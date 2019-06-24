package com.tobias.structure.bridge;

public class ACVBank extends Bank {

  public ACVBank(Account account) {
    super(account);
  }

  @Override
  public void showAccountType() {
//    System.out.println("ACVBank warm prompt :: type of account is " + account.getType());
  }

  @Override
  public void showAccountMoney() {
//    System.out.println("ACVBank warm prompt :: this account still have " + account.peakMoney());
  }
}
