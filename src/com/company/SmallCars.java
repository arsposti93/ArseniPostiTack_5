package com.company;

import java.time.LocalDate;

public class SmallCars extends Car {

  private String type;

SmallCars () {}

SmallCars (EnumCars enumCars) {
  super(enumCars);
}

  public SmallCars (String name, String color, boolean status, int id, EnumCars enumCars,
      LocalDate localDate, String type) {
    super(name, color, status, id, enumCars, localDate);
    this.type = type;
  }

  @Override
  public void move() {
    System.out.println("I am moving fast");
  }

  @Override
  public String toString() {
  return super.toString()+", "+type+".";

  }

  @Override
  public void stop() {
    System.out.println("I am stoping slowly");}

public int checkDoors (int numberOfDoors) {

  switch (numberOfDoors) {
    case 3 :
      System.out.println("Трехдверная");
      break;
    case 5 :
      System.out.println("Пятидвреная");
      break;
    default:
      System.out.println("Не достаточно дверей");
  }
  return numberOfDoors;
}
}




