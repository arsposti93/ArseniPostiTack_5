package com.Car;

import com.company.EnumCars;

import java.time.LocalDate;
import java.util.Objects;

public class Trucks extends Car {

    private int numberOfWheels;
    private int maxLoadingCapacity;
    private boolean trailer;

    public Trucks(int id, String name, int price) {
        super(id, name, price);
    }

    public Trucks(EnumCars enumCars) {
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
    public String setMotorAndTransmission() {
        return super.setMotorAndTransmission();
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(", грузоподъёмность").append(maxLoadingCapacity).append(" тонн,")
                .append(" количество колёс: ").append(numberOfWheels).append(", ").append(checkTrailer());
        return stringBuilder.toString();
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trucks)) return false;
        if (!super.equals(o)) return false;
        Trucks trucks = (Trucks) o;
        return getNumberOfWheels() == trucks.getNumberOfWheels() &&
                getMaxLoadingCapacity() == trucks.getMaxLoadingCapacity() &&
                isTrailer() == trucks.isTrailer();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberOfWheels(), getMaxLoadingCapacity(), isTrailer());
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
