package com.company;

import java.time.LocalDate;

public class Trucks extends Car {

  private int numberOfWheels;
  private int maxLoadingCapacity;
  private boolean trailer;

  Trucks(EnumCars enumCars) {
    super(enumCars);
  }

  public Trucks(String name, String color, boolean status, int id,
      EnumCars enumCars, LocalDate localDate, int maxLoadingCapacity, int numberOfWheels,
      boolean trailer) {
    super(name, color, status, id, enumCars, localDate);
    this.maxLoadingCapacity = maxLoadingCapacity;
    this.numberOfWheels = numberOfWheels;
    this.trailer = trailer;
  }

  @Override
  public void move() {
    System.out.println("I  move slower, than small cars");
  }

  @Override
  public void stop() {
    System.out.println("I have heavy weight, so i brake slowly");
  }

  @Override
  public String toString() {
    return super.toString() + ", грузоподъёмность " + maxLoadingCapacity + " тонн, "
        + "количество колес: " + numberOfWheels + ", " + checkTrailer();
  }

  public String checkTrailer() {
    if (trailer) {
      return " Имеется возможность добавить прицеп ";
    } else {
      return " Возможность добавить прицеп отсутствует ";
    }
  }

  public void move(String string) {
    string = "Переопределение метода";
    System.out.println(string);
  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public int getMaxLoadingCapacity() {
    return maxLoadingCapacity;
  }

  public void setMaxLoadingCapacity(int maxLoadingCapacity) {
    this.maxLoadingCapacity = maxLoadingCapacity;
  }

  public boolean isTrailer() {
    return trailer;
  }

  public void setTrailer(boolean trailer) {
    this.trailer = trailer;
  }
}
