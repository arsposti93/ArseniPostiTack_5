package com.company;


import java.time.LocalDate;

public class Trucks extends Car  {

  private int numberOfWheels;
  private int maxLoadingCapacity;
  private boolean trailer;

  Trucks (EnumCars enumCars) {
    super(enumCars);
  }

  public Trucks(String name, String color, boolean status, int id,
      EnumCars enumCars, int maxLoadingCapacity, int numberOfWheels, boolean trailer ) {
    super(name, color, status, id, enumCars);
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
    String s1 = "Название машины: " + getName() + ", " + "цвет: " + getColor() + ", " +
        "cостояние: движется" + ", " + "identification number: " + getId() + ", " + enumCars
        .getInfo() + ", " + "Максимальная грузоподъёмность: " + maxLoadingCapacity + ", "
        + "Число колес: " + numberOfWheels + checkTrailer() + ".";
    String s2 = "Название машины: " + getName() + ", " + "цвет: " + getColor() + ", " +
        "cостояние: в покое" + ", " + "identification number: " + getId() + ", " + enumCars
        .getInfo() + ", " + "Максимальная грузоподъёмность: " + maxLoadingCapacity + ", "
        + "Число колес: " + numberOfWheels + checkTrailer() +".";
    if (isStatus()) {
      System.out.println(s1);
      return s1;
    } else {
      System.out.println(s2);
      return s2;
    }
  }

  public String checkTrailer() {
    if (trailer) {
      return " Имеется возможность добавить прицеп ";
    } else {
      return " Возможность добавить прицеп отсутствует ";
    }
  }

  public void move (String string ) {
   string = "Переопределение метода";
    System.out.println(string);
  }

}
