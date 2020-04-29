package com.company;

import java.time.LocalDate;

public class SmallCars extends Car {

  private String type;


SmallCars () {}

SmallCars (EnumCars enumCars) {
  super(enumCars);
}

  public SmallCars(String name, String color, boolean status, int id, EnumCars enumCars,
      String type) {
    super(name, color, status, id, enumCars);
    this.type = type;
  }




  @Override
  public void move() {
    System.out.println("I am moving fast");
  }

  @Override
  public String toString() {
    String s1 = "Название машины: " + getName() + ", " + "цвет: " + getColor() + ", " +
        "cостояние: движется" + ", " + "identification number: " + getId() + ", " + enumCars
        .getInfo() + ", " + type + ".";
    String s2 = "Название машины: " + getName() + ", " + "цвет: " + getColor() + ", " +
        "cостояние: в покое" + ", " + "identification number: " + getId() + ", " + enumCars
        .getInfo() + ", " + type + ".";
    if (isStatus()) {
      System.out.println(s1);
      return s1;
    } else {
      System.out.println(s2);
      return s2;
    }
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




