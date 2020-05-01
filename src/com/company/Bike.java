package com.company;

public class Bike implements Movable {

  private String name;
  private int weight;
  private int numberOfWheels;

  public Bike(String name, int weight, int numberOfWheels) {
    this.name = name;
    this.weight = weight;
    this.numberOfWheels = numberOfWheels;
  }

  public String toString() {
    return "Велосипед модели: " + name + ", весит: " + weight + " kg, " + " количество колёс: " +
        numberOfWheels + ".";
  }

  public String jump() {
    return "I am jumping";
  }

  @Override
  public void stop() {
    System.out.println("Sometimes i can not stop, and falling");
  }

  @Override
  public void move() {
    numberOfWheels = 1;
    System.out.println("I can ride on " + numberOfWheels + " wheel!");
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

}
