package com.tobias.behavior.visitor;

public interface Element {

  void accept(Visitor visitor);

}
