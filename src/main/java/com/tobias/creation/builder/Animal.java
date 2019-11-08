package com.tobias.creation.builder;

public class Animal {

  private int type;
  private String name;

  private Animal(AnimalBuilder builder) {
    this.type = builder.type;
    this.name = builder.name;
  }

  public static class AnimalBuilder {

    private int type;
    private String name;

    public int getType() {
      return type;
    }

    public AnimalBuilder setType(int type) {
      this.type = type;
      return this;
    }

    public String getName() {
      return name;
    }

    public AnimalBuilder setName(String name) {
      this.name = name;
      return this;
    }

    public Animal build() {
      return new Animal(this);
    }
  }

  public int getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "type=" + type +
        ", name='" + name + '\'' +
        '}';
  }
}
