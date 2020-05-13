package com.company;

import com.Bike.Bike;
import com.Car.Car;
import com.Car.SmallCars;
import com.Car.Trucks;
import com.Horse.Horse;

import com.Store.Store;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();

        SmallCars car1 = new SmallCars(1, "Mersedes", 9000);
        SmallCars car2 = new SmallCars(2, "Mersedes-Benz", 8300);
        SmallCars car3 = new SmallCars(3, "Mazda", 9399);
        SmallCars car4 = new SmallCars(4, "Mini-coper", 1735);
        SmallCars car5 = new SmallCars(5, "Lada", 100);
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);

        Store<Car> store1 = new Store<>(15000, list);

        store1.printList(list);
        store1.sell(16000, new SmallCars(6, "Audi", 16100));
        System.out.println("-----------------------------------");
        store1.printList(list);
        store1.purchase(500, 4);
        System.out.println("-----------------------------------");
        store1.printList(list);


        SmallCars car8 = new SmallCars("BMW", "black", true, 6,
                EnumCars.BMW, LocalDate.ofYearDay(1999, 1), "sedan");
        System.out.println(car8.toString());


    }
}
