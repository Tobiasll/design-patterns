package com.tobias.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class Order implements Element {

  private final List<Item> items = new ArrayList<>();
  private String name;

  public Order(String name) {
    this.name = name;
  }

  public Order(String name, String itemName) {
    this.name = name;
    items.add(new Item(itemName));
  }

  public String getName() {
    return name;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
    for (Item item : items) {
      visitor.visit(item);
    }
  }

  public void addItem(Item item) {
    items.add(item);
  }

}
