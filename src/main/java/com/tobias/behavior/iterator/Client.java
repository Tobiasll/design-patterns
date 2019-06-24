package com.tobias.behavior.iterator;

public class Client {

  public static void main(String[] args) {
    Aggregate<Integer> aggregate = new ConcreteAggregate();
    Iterator<Integer> iterator = aggregate.createIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
