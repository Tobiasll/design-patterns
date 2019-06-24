package com.tobias.behavior.iterator;

public class ConcreteAggregate<E> implements Aggregate {

  private Integer[] items;

  public ConcreteAggregate() {
    items = new Integer[10];
    for (int i = 0; i < 10; i++) {
      items[i] = i;
    }
  }

  @Override
  public Iterator createIterator() {
    return new ConcreteIterator<>(items);
  }
}
