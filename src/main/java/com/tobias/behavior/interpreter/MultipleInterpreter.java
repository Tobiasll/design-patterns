package com.tobias.behavior.interpreter;

public class MultipleInterpreter implements Interpreter {

  private Interpreter firstInterpreter;
  private Interpreter secondInterpreter;

  public MultipleInterpreter(Interpreter firstInterpreter,
      Interpreter secondInterpreter) {
    this.firstInterpreter = firstInterpreter;
    this.secondInterpreter = secondInterpreter;
  }


  @Override
  public int interpreter() {
    return firstInterpreter.interpreter() * secondInterpreter.interpreter();
  }

  @Override
  public String toString() {
    return "*";
  }
}
