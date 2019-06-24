package com.tobias.behavior.iterator;

public interface Aggregate<T> {

  Iterator<T> createIterator();
}
