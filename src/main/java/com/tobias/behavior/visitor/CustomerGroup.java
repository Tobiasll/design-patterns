package com.tobias.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class CustomerGroup implements Element {

  private final List<Customer> customers = new ArrayList<>();

  public void addCustomer(Customer customer) {
    customers.add(customer);
  }

  @Override
  public void accept(Visitor visitor) {
    for (Customer customer : customers) {
      customer.accept(visitor);
    }
  }
}
