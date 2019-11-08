package com.tobias.behavior.interpreter;

import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    String[] arr = {"6", "100", "11", "+", "*"};
    Stack<Object> stack = new Stack<>();
    for (String s : arr) {
      if ("+".equals(s) | "*".equals(s)) {
        NumberInterpreter first = new NumberInterpreter(stack.pop().toString());
        NumberInterpreter second = new NumberInterpreter(stack.pop().toString());
        Interpreter interpreterByCondition = getInterpreterByCondition(s, first, second);
        stack.push(interpreterByCondition.interpreter());
      } else {
        stack.push(s);
      }
    }
    System.out.println(stack.pop());
  }

  private static Interpreter getInterpreterByCondition(String symbol, NumberInterpreter first,
      NumberInterpreter second) {
    if ("+".equals(symbol)) {
      return new AddInterpreter(first, second);
    } else if ("*".equals(symbol)) {
      return new MultipleInterpreter(first, second);
    }
    return new EmptyInterpreter();
  }
}
