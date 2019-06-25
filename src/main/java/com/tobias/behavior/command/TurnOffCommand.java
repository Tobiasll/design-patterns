package com.tobias.behavior.command;

public class TurnOffCommand implements Command {

  private Light light;

  public TurnOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    System.out.print("excuse command from TurnOffCommand :: ");
    light.turnOff();
  }
}
