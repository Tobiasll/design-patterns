package com.tobias.behavior.command;

public class Main {

  public static void main(String[] args) {
    Light light = new Light();
    TurnOnCommand turnOnCommand1 = new TurnOnCommand(light);
    TurnOffCommand turnOffCommand = new TurnOffCommand(light);
    TurnOnCommand turnOnCommand2 = new TurnOnCommand(light);
    Executor executor = new Executor();
    executor.addComand(turnOnCommand1);
    executor.addComand(turnOffCommand);
    executor.addComand(turnOnCommand2);
    executor.excuteCommands();
  }
}
