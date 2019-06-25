package com.tobias.behavior.command;

public class TurnOnCommand implements Command {

  private Light light;

  public TurnOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    System.out.print("excuse command from TurnOnCommand :: ");
    light.turnOn();
  }
}
