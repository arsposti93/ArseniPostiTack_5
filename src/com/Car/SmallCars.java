package com.Car;

import com.company.EnumCars;

import java.time.LocalDate;
import java.util.Objects;

public class SmallCars extends Car {

    private String type;

    public SmallCars(int id, String name, int price) {
        super(id, name, price);
    }

    public SmallCars(EnumCars enumCars) {
        super(enumCars);
    }

    public SmallCars(String name, String color, boolean status, int id, EnumCars enumCars,
                     LocalDate localDate, String type) {
        super(name, color, status, id, enumCars, localDate);
        this.type = type;
    }

    @Override
    public String setMotorAndTransmission() {
        return super.setMotorAndTransmission();
    }

    @Override
    public void move() {
        System.out.println("I am moving fast");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(", ").append(type);

        return stringBuilder.toString();

    }

    @Override
    public void stop() {
        System.out.println("I am stoping slowly");
    }

    public int checkDoors(int numberOfDoors) {

        switch (numberOfDoors) {
            case 3:
                System.out.println("Трехдверная");
                break;
            case 5:
                System.out.println("Пятидвреная");
                break;
            default:
                System.out.println("Не достаточно дверей");
        }
        return numberOfDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmallCars)) return false;
        if (!super.equals(o)) return false;
        SmallCars smallCars = (SmallCars) o;
        return getType().equals(smallCars.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}




