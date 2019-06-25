package com.tobias.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Executor {

  private final List<Command> commands = new ArrayList<>();

  public void addComand(Command command) {
    commands.add(command);
  }

  public void excuteCommands() {
    commands.forEach(Command::execute);
    commands.clear();
  }

}
