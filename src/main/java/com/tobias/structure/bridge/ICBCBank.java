package com.tobias.structure.bridge;

public class ICBCBank extends Bank {

  public ICBCBank(Account account) {
    super(account);
  }

  @Override
  public void showAccountType() {
    System.out.println("ICBCBank warm prompt :: type of account is " + account.getType());
  }

  @Override
  public void showAccountMoney() {
    System.out.println("ICBCBank warm prompt :: this account still have " + account.peakMoney());
  }
}
