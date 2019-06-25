package com.tobias.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Element {

  private String name;
  private final List<Order> orders = new ArrayList<>();

  public Customer(String name) {
    this.name = name;
  }

  public void addOrder(Order order) {
    orders.add(order);
  }

  public String getName() {
    return name;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
    for (Order order : orders) {
      order.accept(visitor);
    }
  }
}
