package com.tobias.iterator;

public interface Aggregate<T> {

  Iterator<T> createIterator();
}
