package com.tobias.behavior.interpreter;

public class AddInterpreter implements Interpreter {

  private Interpreter firstInterpreter;
  private Interpreter secondInterpreter;

  public AddInterpreter(Interpreter firstInterpreter,
      Interpreter secondInterpreter) {
    this.firstInterpreter = firstInterpreter;
    this.secondInterpreter = secondInterpreter;
  }

  @Override
  public int interpreter() {
    return firstInterpreter.interpreter() + secondInterpreter.interpreter();
  }

  @Override
  public String toString() {
    return "+";
  }
}
