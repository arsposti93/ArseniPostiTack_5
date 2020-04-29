package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

SmallCars car1 = new SmallCars();
SmallCars car2 = new SmallCars(EnumCars.TOYOTA);
SmallCars car3 = new SmallCars( "BMW", "black",
    false, 3, EnumCars.BMW, "sedan" );

Trucks car6 = new Trucks("Renault", "green",
    true, 5, EnumCars.RENAULT, 20,
    18, true );

Car car4 = new SmallCars( "LADA", "Yellow",
    false, 4, EnumCars.LADA, "hatchback");

Movable car5 = new Trucks("Mersedes", "green",
    true, 5, EnumCars.MERSEDES, 20,
    18, true);

Trucks car7 = new Trucks("Mazda", "green",
    true, 5, EnumCars.MAZDA, 20,
    18, true);

Trucks car8 = new Trucks(EnumCars.VAZ);
Car car9 = new Trucks("Peugeot", "green",
    true, 5, EnumCars.PEUGEOT, 15,
    10, false);



car3.toString();
car6.toString();

car1.move();
car2.stop();

car5.stop();
car7.move("STOP");
car3.checkDoors(3);

car8.foo(car7);
car9.foo(car8);



//
//SmallCars smallCars = new SmallCars();
//smallCars.setEnumCars(EnumCars.TOYOTA);
//      System.out.println(smallCars);



    }
}
