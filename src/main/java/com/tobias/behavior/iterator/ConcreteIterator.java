package com.tobias.behavior.iterator;

public class ConcreteIterator<T> implements Iterator {

  private T[] items;
  private int position;

  public ConcreteIterator(T[] items) {
    this.items = items;
  }

  @Override
  public Object next() {
    return items[position++];
  }

  @Override
  public boolean hasNext() {
    return position < items.length;
  }
}
