package com.tobias.behavior.interpreter;

public class NumberInterpreter implements Interpreter {

  private int number;

  public NumberInterpreter(int number) {
    this.number = number;
  }

  public NumberInterpreter(String number) {
    this.number = Integer.parseInt(number);
  }

  @Override
  public int interpreter() {
    return this.number;
  }

  @Override
  public String toString() {
    return number + "";
  }
}
