package com.Car;


import com.company.EnumCars;
import com.company.Movable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Car implements Movable {

    protected EnumCars enumCars;
    protected String name;
    protected String color;
    protected boolean status;
    protected int id;
    protected LocalDate localDate;
    protected int price;

    Car(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    Car(EnumCars enumCars) {
        this.enumCars = enumCars;
    }

    public Car(String name, String color, boolean status, int id, EnumCars enumCars,
               LocalDate localDate) {
        this.name = name;
        this.color = color;
        this.status = status;
        this.id = id;
        this.enumCars = enumCars;
        this.localDate = localDate;
    }

    public abstract void move();

    public abstract void stop();

    public void checkReady() {
        System.out.println("I am ready");
    }

    public Object showShortInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("№ ").append(id).append(", ").append(name)
                .append(", ").append("цена: ").append(price);
        return stringBuilder;

    }

    public String checkStatus() {
        if (status) {
            return "в движении";
        } else {
            return " в покое";
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Название машины: ").append(name).append(", ").append("цвет машины: ")
                .append(color).append(", ").append(checkStatus()).append(", ")
                .append("идентификационный номер: ").append(id).append(", ").append(enumCars.getInfo())
                .append(", ").append("год выпуска: ").append(getLocalDate()).append(", ")
                .append(setMotorAndTransmission());
        return str.toString();
    }

    public static void foo(Car car) {
        System.out.println(car.showShortInfo());
        ;
    }

    public static void meth(String[] arr) {
        for (String element : arr) {
            System.out.println(element);
        }

    }

    class Motor {

        protected int numOfCylinders;
        protected boolean turbo;


        public Motor(int numOfCylinders, boolean turbo) {
            this.numOfCylinders = numOfCylinders;
            this.turbo = turbo;
        }

        public String showInfoOfMotor() {
            return ("Число цилиндров " + numOfCylinders + "," +
                    checkTurbo());
        }

        public String checkTurbo() {
            if (turbo) {
                return " турбина есть";
            } else
                return " турбины нет";
        }

        class Transmission {

            private boolean autoOrNot;

            Transmission(boolean autoOrNot) {
                this.autoOrNot = autoOrNot;
            }

            public String printTransmission() {
                if (autoOrNot) {
                    return " Коробка автомат ";
                } else
                    return " Коробка механическая ";
            }
        }
    }

    public String setMotorAndTransmission() {
        Motor motor = new Motor(0, true);
        Motor.Transmission transmission = motor.new Transmission(false);
        return motor.showInfoOfMotor() + ", " + transmission.printTransmission();
    }


    public String getLocalDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");
        return localDate.format(dateTimeFormatter);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return status == car.status &&
                id == car.id &&
                price == car.price &&
                enumCars == car.enumCars &&
                name.equals(car.name) &&
                color.equals(car.color) &&
                localDate.equals(car.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enumCars, name, color, status, id, localDate, price);
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public EnumCars getEnumCars() {
        return enumCars;
    }

    public void setEnumCars(EnumCars enumCars) {
        this.enumCars = enumCars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
