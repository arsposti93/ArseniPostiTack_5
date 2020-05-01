package com.company;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    SmallCars car1 = new SmallCars();
    SmallCars car2 = new SmallCars(EnumCars.TOYOTA);
    SmallCars car3 = new SmallCars("BMW", "black",
        true, 3, EnumCars.BMW, LocalDate.ofYearDay(1999, 1), "sedan");
    System.out.println(car3.toString());

    Trucks car6 = new Trucks("Renault", "green",
        true, 5, EnumCars.RENAULT, LocalDate.now(), 20,
        18, true);
    System.out.println(car6.toString());

    Car car4 = new SmallCars("LADA", "Yellow",
        false, 4, EnumCars.LADA, LocalDate.ofYearDay(2003, 3),
        "hatchback");

    Movable car5 = new Trucks("Mersedes", "green",
        true, 5, EnumCars.MERSEDES, LocalDate.ofYearDay(2007, 2), 20,
        18, true);

    Trucks car7 = new Trucks("Mazda", "green",
        true, 5, EnumCars.MAZDA, LocalDate.ofYearDay(2007, 2),
        20, 18, true);

    Trucks car8 = new Trucks(EnumCars.VAZ);

    Car car9 = new Trucks("Peugeot", "green",
        true, 5, EnumCars.PEUGEOT, LocalDate.ofYearDay(2021, 3),
        15, 10, false);

    Bike bike = new Bike("BMX", 12, 2);
    System.out.println(bike.toString());

    Horse horse = new Horse("Matilda", 14);
    System.out.println(horse.toString());

    car1.move();
    car2.stop();

    car5.stop();
    car7.move("STOP");
    car3.checkDoors(3);

    car8.foo(car7);
    car9.foo(car8);

  }
}
