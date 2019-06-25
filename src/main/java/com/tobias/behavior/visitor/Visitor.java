package com.tobias.behavior.visitor;


/**
 * 为一个对象结构（比如组合结构）增加新能力。
 */
public interface Visitor {

  void visit(Customer customer);

  void visit(Order order);

  void visit(Item item);

}
